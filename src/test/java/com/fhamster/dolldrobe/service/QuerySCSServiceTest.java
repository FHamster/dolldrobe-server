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
        service.getSC("07TV4J0NCDHY1YXNJ7K04TJ5Q 6IR OH0DESJP0Y");
    }
}