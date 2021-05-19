package com.example.demo.controller;

import com.example.demo.service.TypeMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

@Controller
public class HomeController {
    @Autowired
    private TypeMenuService typeMenuService;
    @RequestMapping(method = RequestMethod.GET, value = "")
    public String home(Model model) {
        File folder = null;
        try {
            folder = ResourceUtils.getFile("classpath:static/images");

            for (final File fileEntry : folder.listFiles()) {
                if (fileEntry.isDirectory()) {
                    ArrayList<String> images = new ArrayList<>();
                    for (File image : fileEntry.listFiles()) {
                        images.add(image.getName());
                    }
                    model.addAttribute(fileEntry.getName(), images);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("НЕ НАЙДЕНО");
            e.printStackTrace();
        }
        model.addAttribute("types", typeMenuService.findAll());
        return "home";
    }
    @RequestMapping(method = RequestMethod.GET, value = "/address")
    public String address() {
        return "address.html";
    }
    @RequestMapping(method = RequestMethod.GET, value = "/building")
    public String building() {
        return "building.html";
    }
    @RequestMapping(method = RequestMethod.GET, value = "/registration")
    public String registration() {
        return "registration";
    }
    @RequestMapping(method = RequestMethod.GET, value = "/login")
    public String login() {
        return "login";
    }

}
