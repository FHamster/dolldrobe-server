package com.fhamster.dolldrobe.dao;

import com.fhamster.dolldrobe.model.FPageCommodity;
import com.fhamster.dolldrobe.model.User;
import com.fhamster.dolldrobe.model.UserExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    UserMapper dao;

    @Autowired
    FPageCommodityMapper mapper;

    @Test

    public void selectByExample() {
        UserExample example = new UserExample();
        example.createCriteria();

        List<User> userList = dao.selectByExampleWithBLOBs(example);
        userList.forEach(System.out::println);
    }
}