package com.example.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class BackendController {
    
    @GetMapping
    public String get (){
        return "Olá Mundoxx ";
    }
}
