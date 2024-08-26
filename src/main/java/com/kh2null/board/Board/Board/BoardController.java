package com.kh2null.board.Board.Board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

    @GetMapping("/board")
    String board() {
        System.out.println("메인페이지");
        return "board.html";
    }
}
