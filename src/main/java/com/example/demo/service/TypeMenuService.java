package com.example.demo.service;

import com.example.demo.model.TypeMenu;
import com.example.demo.repository.TypeMenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Service
@Transactional
public class TypeMenuService {
    @Autowired
    private TypeMenuRepository typeMenuRepository;//подключили репозиторий

    public boolean typeMenuAdd(TypeMenu typeMenu){
        if (typeMenuRepository.findByName(typeMenu.getName())!=null){
            return false;
        }
       /* if (userRepository.findByMail(user.getMail())!=null){
            return false;
        }*/

        typeMenuRepository.save(typeMenu);
        return true;
    }
    public Iterable<TypeMenu> findAll(){
        return typeMenuRepository.findAll();
    }





}
