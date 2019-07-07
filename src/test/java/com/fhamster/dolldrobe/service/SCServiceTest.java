package com.fhamster.dolldrobe.service;

import com.fhamster.dolldrobe.dao.FPageCommodityMapper;
import com.fhamster.dolldrobe.model.FPageCommodity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SCServiceTest {
    @Autowired
    SCService service;

    @Test
    public void getSkudao() {
        service.insertSC("01PWQSYWR6KX7ATQBPC2YCCBY4H9B2BY","07TV4J0NCDHY1YXNJ7K04TJ5Q 6IR OH0DESJP0Y",1);
        System.out.println("成功");



    }
}