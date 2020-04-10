package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class SpringBootController {

    @GetMapping("/current-date")
    public LocalDate getDate() {
        return java.time.LocalDate.now();
    }

    @GetMapping("/welcome")
    public String welcome(@RequestParam(value = "name", defaultValue = "Andy") String name) {
        return "Welkom " + name +"!";
    }

}
