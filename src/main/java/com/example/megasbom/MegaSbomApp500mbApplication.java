package com.example.megasbom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MegaSbomApp500mbApplication {

    public static void main(String[] args) {
        SpringApplication.run(MegaSbomApp500mbApplication.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "Mega SBOM App 500MB - Running!";
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}
