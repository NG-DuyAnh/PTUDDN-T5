package com.example.securingweb;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController {

    @PutMapping("/put")
    public String putEndpoint() {
        return "PUT endpoint accessed";
    }

    @PostMapping("/post")
    public String postEndpoint() {
        return "POST endpoint accessed";
    }

    @GetMapping("/get")
    public String getEndpoint() {
        return "GET endpoint accessed";
    }

    @DeleteMapping("/delete")
    public String deleteEndpoint() {
        return "DELETE endpoint accessed";
    }
}