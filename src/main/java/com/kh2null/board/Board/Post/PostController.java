package com.kh2null.board.Board.Post;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PostController {

    @GetMapping("/board/write-form")
    String post() {
        System.out.println("글쓰기페이지");
        return "write-form.html";
    }
}
