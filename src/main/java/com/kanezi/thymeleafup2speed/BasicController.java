package com.kanezi.thymeleafup2speed;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BasicController {

    @GetMapping("/")
    String rootMapping() {
        return "basic";
    }
}
