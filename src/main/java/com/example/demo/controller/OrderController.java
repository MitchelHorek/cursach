package com.example.demo.controller;

import com.example.demo.TypeRole;
import com.example.demo.model.Order;
import com.example.demo.model.User;
import com.example.demo.repository.OrderRepository;
import com.example.demo.service.EmailService;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import java.util.Date;

@Controller
public class OrderController {
    @Autowired
    private OrderService orderService;
    @Autowired
    private EmailService emailService;
    @Value("${spring.mail.username}")
    private String myMail;
    @RequestMapping(method = RequestMethod.GET, value = "/order")
    public String order() {
        return "order";
    }
    @PostMapping(value = "/order")
    public RedirectView sendOrder(@RequestParam String name,@RequestParam String mail,
                                         @RequestParam String comment){
        try{
            boolean result = orderService.orderAdd(new Order(mail, name,new Date(),comment));
            if(!result){
                return new RedirectView("error");
            }
        }catch(Exception ex){
            ex.printStackTrace();
            System.out.println("Error");
            return new RedirectView("error");
        }
        if(emailService!=null) {
            emailService.send(mail, "ВАШ ЗАКАЗ ПРИНЯТ НА ОБРАБОТКУ", "СПАСИБО ЗА ЗАКАЗ: <br>" + comment);
            emailService.send(myMail, "ПРИШЕЛ ЗАКАЗ", "ПОМОТРИ: "+"\n" + comment + "\n" +"ПОЧТА ЗАКАЗЧИКА: " +"\n" + mail);
        }
        return new RedirectView("/");

    }
}
