package com.springboot.learnspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CurrencyConfigController {
    @Autowired
    private CurrencyServiceConfiguration configuration;
    @RequestMapping("/currency-config")
    public CurrencyServiceConfiguration getAllCourses(){
        return configuration;
    }
}

/*
    install json formatter extension for chrome to see the output formatted
    JSON output in Chrome: http://localhost:8080/courses
        [
            {
            "id": 1,
            "name": "J2EE",
            "author": "UDEMY"
            },
            {
            "id": 2,
            "name": "Spring Boot",
            "author": "UDEMY"
            }
        ]
 */
