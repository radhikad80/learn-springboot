package com.springboot.learnspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    @RequestMapping("/courses")
    public List<Course> getAllCourses(){
        return Arrays.asList(new Course(1, "Learn J2EE", "UDEMY"),
                                new Course(2, "Learn Spring Boot", "UDEMY"),
                                //new Course(3, "Learn Microservices", "UDEMY"),
                                new Course(4, "Learn Microservices", "UDEMY"));
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
