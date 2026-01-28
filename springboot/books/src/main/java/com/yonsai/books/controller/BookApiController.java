package com.yonsai.books.controller;

import com.yonsai.books.entity.Book;
import com.yonsai.books.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController // 이게 있어야 JSON으로 데이터를 보냅니다!
@RequestMapping("/api") // 주소 앞에 /api를 붙여줍니다.
@RequiredArgsConstructor // 생성자 주입을 자동으로 해줍니다.
public class BookApiController {

    private final BookRepository bookRepository;

    @GetMapping("/books")
    // @LogExe // 아까 만든 로그 어노테이션이 있다면 붙여주세요!
    public List<Book> getAllBooks() {
        return bookRepository.findAll(); // DB의 모든 데이터를 가져옵니다.
    }
}