package com.wildcodeschool.myProjectWithSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/")
    public String hello() {
        return "Welcome to the SHIELD";
    }

    @GetMapping("/avengers/assemble")
    public String user() {
        return "Avengers... Assemble";
    }

    @GetMapping("/secret-bases")
    public String admin() {
        return "Liste de toutes les villes où il y a une WildCodeSchoo: ( le lien marchait pas)";
    }
}
