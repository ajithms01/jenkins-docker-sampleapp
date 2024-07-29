package com.ust.springboot_docker_jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
    @GetMapping("/docker")
    public String helloDocker() {
        return "Hello, Docker! This is the Spring Boot app running in a Docker container.";
    }
}
