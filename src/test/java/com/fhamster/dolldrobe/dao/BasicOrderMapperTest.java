package com.fhamster.dolldrobe.dao;

import com.fhamster.dolldrobe.model.BasicOrderExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BasicOrderMapperTest {

    @Autowired
    BasicOrderMapper dao;

    @Test
    public void selectByExample() {
        BasicOrderExample example = new BasicOrderExample();
        example.createCriteria();

        dao.selectByExample(example)
                .stream().forEach(System.out::println);
    }
}