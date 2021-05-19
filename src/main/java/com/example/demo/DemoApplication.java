package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DemoApplication {
    //public static ArrayList<Address> addresses = new ArrayList<>();
    //public static ArrayList<Building> buildings = new ArrayList<>();

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

    }

    //public void addAddress(String addressText, String zipCode){
    // Address address = new Address(addressText,zipCode);
}
//перенос контроллера(функционал) в сервис(отдельный класс) и создание интерфейсов для сервиса!
//вся бизнесс логика находится в сервисе
//log в отдельный файл

