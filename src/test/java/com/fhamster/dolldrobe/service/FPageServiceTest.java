package com.fhamster.dolldrobe.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FPageServiceTest {

    @Autowired
    FPageService service;
    @Test
    public void query() {
        service.getCom("root")
                .forEach(System.out::println);
    }

    @Test
    public void insertFPage() {
        service.InsertFPage("root", "462WPE4F5VG59946GAXN3M2IYC8F4GXH");
    }
}
