package br.com.api.reiapi.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
/* import org.springframework.web.bind.annotation.RequestParam; */


@RestController

public class ReiController {
    @GetMapping("/")
    public String Hello() {
        return "Hello World!";
    }
    
}
