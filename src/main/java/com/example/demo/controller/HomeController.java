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
import java.util.HashMap;

@Controller
public class HomeController {
    @Autowired
    private TypeMenuService typeMenuService;
    @RequestMapping(method = RequestMethod.GET, value = "")
    public String home(Model model) {
        File folder = null;
        HashMap<String, ArrayList<String>> mapImages = new HashMap<>();
        try {
            folder = ResourceUtils.getFile("classpath:static/images");

            for (final File folderEntry : folder.listFiles()) {
                if (folderEntry.isDirectory()) {
                    ArrayList<String> images = new ArrayList<>();
                    for (File image : folderEntry.listFiles()) {
                        images.add(image.getName());
                    }
                    mapImages.put(folderEntry.getName(),images);

                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("НЕ НАЙДЕНО");
            e.printStackTrace();
        }
        model.addAttribute("mapImages", mapImages);
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
