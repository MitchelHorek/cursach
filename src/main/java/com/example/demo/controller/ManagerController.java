package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ManagerController {
    @Autowired
    private EmailService emailService;
    @GetMapping(value = "/admin")
    public String admin(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        boolean isAdmin = false;
        if (!(authentication instanceof AnonymousAuthenticationToken)) {
            //String currentUserName = authentication.getName();
            User principal = (User)authentication.getPrincipal();
            isAdmin = principal.isManager();

        }
        if(isAdmin){
            return "admin";
        }

        return "error";
    }
}
