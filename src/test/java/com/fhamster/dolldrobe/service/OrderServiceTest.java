package com.fhamster.dolldrobe.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderServiceTest {

    @Autowired
    OrderService service;

    @Test
    public void getAllOrderList() throws Exception {
        String uacc = "V9ELSNV2KO6IDNL73INO BMNVF48MDLTYQ0WRTG9";
        service.getAllOrderList(uacc).forEach(System.out::println);

    }
}