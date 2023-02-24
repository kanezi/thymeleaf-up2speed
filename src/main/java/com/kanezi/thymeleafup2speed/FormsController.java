package com.kanezi.thymeleafup2speed;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/forms")
@Log4j2
public class FormsController {


    record MessageForm(
            @NotBlank
            @Size(min = 3, message = "{forms.message.size}")
            String message) {
    }

    @GetMapping
    String showForm(@ModelAttribute MessageForm messageForm) {
        return "forms";
    }

    @PostMapping
    String submitForm(@Valid MessageForm messageForm, Errors errors, RedirectAttributes attributes) {
        log.info("submitted => {}", messageForm);

        if (errors.hasErrors()) {
            return "forms";
        }

        attributes.addFlashAttribute("toastMessage", "Success!!!");

        return "redirect:/forms";
    }

}
