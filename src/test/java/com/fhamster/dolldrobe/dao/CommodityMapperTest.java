package com.fhamster.dolldrobe.dao;

import com.fhamster.dolldrobe.model.Commodity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CommodityMapperTest {
    @Autowired
    CommodityMapper dao;

    @Test
    public void selectByExampleWithBLOBs() {
    }

    @Test
    public void selectByPrimaryKey() {

        Commodity commodity = dao.selectByPrimaryKey("1ULWCDYC8TNOQP5LVAIB6TOXENHABWJL");
        System.out.println(commodity);
    }
}