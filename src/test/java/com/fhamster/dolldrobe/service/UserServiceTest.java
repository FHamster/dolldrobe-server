package com.fhamster.dolldrobe.service;

import com.fhamster.dolldrobe.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {
    @Autowired
    UserService service;
    @Test
    public void isPswMatch() {
        service.isPswMatch("root","root");
    }

    @Test
    public void isAccUnique() {
        service.isAccUnique("root");
    }

    @Test
    public void addtUser() {
        User user = new User();
        user.setuAccountnumber("gaoxin");
        user.setuPsw("1234567");
        service.addtUser(user);
    }

}