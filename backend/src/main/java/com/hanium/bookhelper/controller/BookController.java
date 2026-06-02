package com.hanium.bookhelper.controller;

import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @GetMapping("/api/books")
    public List<Map<String, Object>> books() {
        return List.of(
                Map.of("title", "Spring Boot 입문", "author", "Example Author", "price", 18000, "available", true),
                Map.of("title", "접근성 UX 설계", "author", "Accessibility Team", "price", 22000, "available", true)
        );
    }
}
