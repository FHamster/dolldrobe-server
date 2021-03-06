package com.fhamster.dolldrobe.controller;

import com.fhamster.dolldrobe.dao.UserMapper;
import com.fhamster.dolldrobe.model.DDToken;
import com.fhamster.dolldrobe.model.User;
import com.fhamster.dolldrobe.model.UserExample;
import com.fhamster.dolldrobe.util.PassToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Properties;

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

    @PassToken
    @RequestMapping("testInit")
    @ResponseBody
    public Properties testInit() {
        Properties properties =new Properties();
        properties.put("14f", "asfjhb");
        properties.put("14bf", "asfjhb");
        properties.put("14gsf", "asfjhb");
        properties.put("14sgbf", "asfjhb");
        return properties;
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

