package com.hermes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Hermes33Application {

    public static void main(String[] args) {
        SpringApplication.run(Hermes33Application.class, args);
    }
}

// ЭТОТ КОД ДЛЯ ПРОВЕРКИ ↓↓↓
@RestController
class TestController {
    @GetMapping("/")
    public String hello() {
        return "HERMES is running!";
    }
}