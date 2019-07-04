package com.fhamster.dolldrobe.service;

import com.fhamster.dolldrobe.dao.CommodityMapper;
import com.fhamster.dolldrobe.model.Commodity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GoodServiceTest {
    @Autowired
    GoodService service;
    @Test
    public void getGood() {

        List<Commodity> list = service.getGood("AD", 1, 5);
        list.forEach(System.out::println);
    }

    @Test
    public void getGood1() {

        for (int i = 0; i < 6; i++) {

            service.getGood("", i, 5).forEach(System.out::println);
            System.out.println();
        }
    }

    @Test
    public void getGood2() {
    }
}