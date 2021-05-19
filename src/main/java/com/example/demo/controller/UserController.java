package com.example.demo.controller;

import com.example.demo.TypeRole;
import com.example.demo.model.User;
import com.example.demo.service.EmailService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private EmailService emailService;

    @PostMapping(value = "/registration")
    public RedirectView sendRegistration(@RequestParam Long phone, @RequestParam String mail,@RequestParam String familia,
                                         @RequestParam String name,@RequestParam String otchestvo,
                                         @RequestParam String login, @RequestParam String password){
        try{
            boolean result = userService.userAdd(new User(TypeRole.casual,phone,mail,familia,name,otchestvo,login, password));
            if(!result){
                return new RedirectView("error");
            }
        }catch(Exception ex){
            return new RedirectView("error");
        }
        if(emailService!=null) {
            emailService.send(mail, "регистрация на сайте кафе", "СПАСИБО ЗА ВХОД");
        }
        return new RedirectView("home");

    }

}
