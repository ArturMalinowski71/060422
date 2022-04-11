package com.example2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		JokeRepository JokeRepository = context.getBean(JokeRepository.class);
		JokeService jokeService = new JokeService();
		Joke jokeTest = new Joke(jokeService.getJoke().getValue(),jokeService.getJoke().getCreated_at(),jokeService.getJoke().getIcon_url(),jokeService.getJoke().getUrl());
	}

}
