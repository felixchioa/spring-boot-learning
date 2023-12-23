package com.example.demo.controller;

import com.example.demo.dto.LoginDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * This is the controller class for the login page.
 * @author FoneZzz
 */
@Controller
public class LoginController {

    @GetMapping("/")
    public ModelAndView loginPage() {
        return new ModelAndView("login", "loginDto", new LoginDto());
    }

    private static final String VALID_USERNAME = "user";
    private static final String VALID_PASSWORD = "pwd";

    @PostMapping("/login")
    public String login(LoginDto loginDto) {
        if (VALID_USERNAME.equals(loginDto.getUsername()) && VALID_PASSWORD.equals(loginDto.getPassword())) {
            return "redirect:/welcome";
        }
        return "redirect:/fail";
    }

    @GetMapping("/welcome")
    public String welcomePage() {
        return "welcome";
    }

    @GetMapping("/fail")
    public String failPage() {
        return "fail";
    }
}
