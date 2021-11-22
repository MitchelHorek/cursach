package com.example.demo.controller;

import com.example.demo.model.Order;
import com.example.demo.model.User;
import com.example.demo.service.EmailService;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class ManagerController {
    @Autowired
    private EmailService emailService;
    @Autowired
    private OrderService orderService;
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

        return "error.ftlh";
    }
    @GetMapping(value="/admin/orders")
    public String getOrders(Model model) {
        List<Order> orders = orderService.getAll();
        model.addAttribute("orders",orders);
        return "admin";
    }
    @RequestMapping(value="/admin/order/edit", method= RequestMethod.POST)
    public String editOrder(@RequestBody MultiValueMap<String, String> formData, Model model) {
        System.out.println(formData);
        return "admin";
    }
    //@GetMapping(value="/admin/order/delete")

}

