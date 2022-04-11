package com.example2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Joke {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String value;
    private String created_at;
    private String icon_url;
    private String url;

    public Joke(String value, String created_at, String icon_url, String url) {
        this.value = value;
        this.created_at = created_at;
        this.icon_url = icon_url;
        this.url = url;
    }
}
