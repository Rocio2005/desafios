package com.desafio.disney.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping
    public String helloWord(@RequestParam(value="name", defaultValue = "world") String name){
        return "Hello "+name+"!";
    }
}
