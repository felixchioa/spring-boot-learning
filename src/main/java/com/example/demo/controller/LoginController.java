package com.example.demo.controller;

import com.example.demo.dto.UserData;
import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class LoginController {

    @RequestMapping(value = "goToLoginPage")
    public String toLoginPage(Model model) {
        List<String> usernames = new ArrayList<>();
        usernames.add("LiSa");
        usernames.add("Joey");
        usernames.add("Sam");
        model.addAttribute("usernames", usernames);
        model.addAttribute("pageTitle", "LoginPage");
        return "login.html";
    }

    @PostMapping(value = "login")
    public String toLoginPage(@ModelAttribute UserData user) {
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        return "login.html";
    }

}