package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;//подключили репозиторий
    @Autowired
    private PasswordEncoder passwordEncoder;

    public boolean userAdd(User user){
        if (userRepository.findByLogin(user.getUsername())!=null){
            return false;
        }
       /* if (userRepository.findByMail(user.getMail())!=null){
            return false;
        }*/

        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
        return true;
    }
    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        User user = userRepository.findByLogin(login);
        if (user == null){
            throw new NullPointerException("Пользователь не найден");
            //throw new UsernameNotFoundException("Пользователь не найден");
        }
        return user;
    }
    public Iterable<User> findAll(){
        return userRepository.findAll();
    }





}
