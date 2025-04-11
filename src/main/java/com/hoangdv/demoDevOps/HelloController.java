package com.hoangdv.demoDevOps;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HelloController {
    @GetMapping
    public ResponseEntity<?> hello(){
        return ResponseEntity.ok(Map.of("Chao ban","Hello you"));
    }
}
