package com.example2;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class JokeController {

    private final JokeService jokeService;
<<<<<<< HEAD

=======
    
>>>>>>> b7fdef0f53020dcde2855145b6fc54fbf65ea87d
    @CrossOrigin(origins = "https://norrisapp71.herokuapp.com/joke")
    @GetMapping("/joke")
    public JokeTrueDto getJoke(){
        return jokeService.getJoke();
    }
}
