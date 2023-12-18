package com.example.demo.controller;

import com.example.demo.dto.LoginDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @GetMapping("/")
    public ModelAndView loginPage() {
        return new ModelAndView("login", "loginDto", new LoginDto());
    }

    @PostMapping("/login")
    public String login(LoginDto loginDto) {
        if ("user".equals(loginDto.getUsername()) && "pwd".equals(loginDto.getPassword())) {
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
