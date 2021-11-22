package com.example.demo.service;

import com.example.demo.model.Order;
import com.example.demo.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;//подключили репозиторий
    public boolean orderAdd(Order order){
        orderRepository.save(order);
        return true;
    }
    public List<Order> getAll(){
       return orderRepository.findAll();

    }
}

