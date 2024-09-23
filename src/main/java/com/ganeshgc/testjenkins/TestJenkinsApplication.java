package com.ganeshgc.testjenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class TestJenkinsApplication {
    @GetMapping
    public String hello() {
        return "Hello World ! from the jenkins application";
    }

    public static void main(String[] args) {
        SpringApplication.run(TestJenkinsApplication.class, args);

    }

}
