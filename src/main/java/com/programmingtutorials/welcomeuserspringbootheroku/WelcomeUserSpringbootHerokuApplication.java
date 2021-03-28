package com.programmingtutorials.welcomeuserspringbootheroku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WelcomeUserSpringbootHerokuApplication {

    @GetMapping("/")
    public String welcome() {
        return "Welcome to Springboot Application!";
    }

    @GetMapping("/message/{input}")
    public String getMessage(@PathVariable String input) {
        return "Welcome " + input + "!";
    }

    public static void main(String[] args) {
        SpringApplication.run(WelcomeUserSpringbootHerokuApplication.class, args);
    }
}
