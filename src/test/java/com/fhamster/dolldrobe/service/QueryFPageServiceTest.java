package com.fhamster.dolldrobe.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class QueryFPageServiceTest {

    @Autowired
    QueryFPageService service;
    @Test
    public void query() {
        service.Query(" S2VN2C457H6 SASEBJD7B B 0TTE09C","DNA5BHY GPIJ8VYW42GSPT5PQX3YKTNJQBNX09L0");
    }
}