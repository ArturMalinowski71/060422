package com.example2;

import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

public class JokeRepository {

    private final EntityManager entityManager;

    public JokeRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    @Transactional
    public void save(Joke joke) {
        entityManager.persist(joke);
    }
}
