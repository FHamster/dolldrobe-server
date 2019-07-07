package com.fhamster.dolldrobe.service;

import com.fhamster.dolldrobe.model.ShoppingCart;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class QuerySCSServiceTest {
    @Autowired
    QuerySCSService service;
    @Test
    public void getSC() {
        service.getCartSKu("VYK40E92DOT19DBM PC9SRU K8E0X22P5T94VINV");
    }

    @Test
    public void getSC1() {
    }

    @Test
    public void getSC2() {
    }
}