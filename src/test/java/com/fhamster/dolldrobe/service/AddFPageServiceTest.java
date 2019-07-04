package com.fhamster.dolldrobe.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class AddFPageServiceTest {
    @Autowired
    AddFPageService service;

    @Test
    public void insertFPage() {
        service.InsertFPage("07TV4J0NCDHY1YXNJ7K04TJ5Q 6IR OH0DESJP0Y"," S2VN2C457H6 SASEBJD7B B 0TTE09C");
    }
}