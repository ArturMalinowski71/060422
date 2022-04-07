package com.example2;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class JokeController {

    private final JokeService jokeService;

    @GetMapping("/joke")
    public JokeTrueDto getJoke(){
        return jokeService.getJoke();
    }
}