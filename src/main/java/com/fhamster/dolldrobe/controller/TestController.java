package com.fhamster.dolldrobe.controller;

import com.fhamster.dolldrobe.dao.UserMapper;
import com.fhamster.dolldrobe.model.DDToken;
import com.fhamster.dolldrobe.model.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/test/")
public class TestController {

    @Autowired
    UserMapper dao;

    @Autowired
    StringRedisTemplate redisTemplate;

    @RequestMapping("test")
    public void test() {
        UserExample example = new UserExample();
        example.createCriteria();
//        dao.selectByExampleWithBLOBs(example)
//                .forEach(System.out::println);
    }


    @RequestMapping("redistest")
    public void redistest() {
        DDToken token = new DDToken("ddassd3", "asd3", 1);
        redisTemplate.opsForValue().set(token.getTokenid(), token.getuAccountnumber());
        System.out.println(redisTemplate.opsForValue().get(token.getuAccountnumber()));
    }
}

