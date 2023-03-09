package com.rozato.aws_project01.controller;


import com.rozato.aws_project01.dto.DogDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/test")
public class TestController {
    private static final Logger LOG = LoggerFactory.getLogger(TestController.class);

    @GetMapping("/dog/{name}")
    public ResponseEntity<?> dogTest(@PathVariable String name) {
        LOG.info("Test controller - name: {}", name);

        return ResponseEntity.ok("Name: " + name);
    }

    @PostMapping("/dog")
    public ResponseEntity<?> dogTest(@RequestBody DogDto dogDto) {
        LOG.info("Test controller - name: {}", dogDto.name());

        return ResponseEntity.ok("Name: " + dogDto.name());
    }
}
