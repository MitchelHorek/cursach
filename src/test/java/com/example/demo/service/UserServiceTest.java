package com.example.demo.service;



import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {
    @MockBean
    private PasswordEncoder passwordEncoder;
    @Mock
    private UserRepository userRepository;
    @Test
    public void userAdd() {
        User user = new User();
        user.setLogin("lolpopitcka");
        UserService userService = new UserService(userRepository, passwordEncoder);
        boolean isUserCreated = userService.userAdd(user);
        Assert.assertTrue(isUserCreated);

    }
}