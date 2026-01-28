package com.yonsai.books.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/add")
    public String addBook(@RequestParam String title) {
        return "도서 등록 완료: " + title;
    }

    @GetMapping("/update")
    public String updateBook(@RequestParam String title) {
        return "도서 수정 완료: " + title;
    }

    @GetMapping("/select")
    public String selectBook() {
        return "도서 목록 조회 완료";
    }
}