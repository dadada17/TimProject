package com.kh2null.board.Board.Home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Home {

    @GetMapping("/")
    String home() {
        System.out.println("홈페이지");
        return "redirect:/board";
    }
}
