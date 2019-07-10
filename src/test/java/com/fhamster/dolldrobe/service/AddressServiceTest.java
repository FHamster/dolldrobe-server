package com.fhamster.dolldrobe.service;

import com.fhamster.dolldrobe.dao.ShippingAddressMapper;
import com.fhamster.dolldrobe.model.ShippingAddress;
import com.fhamster.dolldrobe.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AddressServiceTest {

    @Autowired
    AddressService service;

    @Test
    public void getAddress() {
        User user = new User();
        user.setuAccountnumber("root");

        service.getAddress(user).forEach(System.out::println);

    }
}