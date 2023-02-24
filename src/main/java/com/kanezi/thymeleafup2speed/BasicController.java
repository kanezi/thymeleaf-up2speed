package com.kanezi.thymeleafup2speed;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

@Controller
public class BasicController {

    record Post(String author, LocalDate createdOn, String content) {

    }

    @GetMapping("/")
    String rootMapping(Model model) {
        String message = "Welcome to thymeleaf";
        model.addAttribute("message", message);

        Random random = new Random();
        int intTo10 = random.nextInt(10);

        model.addAttribute("intTo10", intTo10);

        List<String> greats = List.of("Ada", "Albert", "Aristotel", "Nikola");

        model.addAttribute("greats", greats);

        model.addAttribute("post", new Post("kanezi", LocalDate.now(), "lorem"));

        return "basic";
    }
}
