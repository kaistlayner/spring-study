package com.example.board.controller;

import com.example.board.dto.HelloDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String getHello(
            @RequestParam(defaultValue = "태균") String name,
            @RequestParam String age)
    {
        return "Hello " + name + " " + age;
    }

    @PostMapping("/hello")
    public ResponseEntity<HelloDto> postHello(@RequestBody HelloDto helloDto) {
        return ResponseEntity.ok(helloDto);
    }
}
