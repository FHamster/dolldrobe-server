package com.fhamster.dolldrobe.controller;


import com.fhamster.dolldrobe.model.DDToken;
import com.fhamster.dolldrobe.model.User;
import com.fhamster.dolldrobe.service.UserService;
import com.fhamster.dolldrobe.util.JwtUtil;
import com.fhamster.dolldrobe.util.PassToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@RequestMapping("/User")
public class RegisterController {

    @Autowired
    UserService service;

    @GetMapping("/UserAccisUnique")
    @PassToken
    public boolean getUserAccisUnique(@RequestParam String acc) {
//        User user1 = JwtUtil.encodeLoginForm(user.getuPsw());
        //TODO 用户名不存在
//        String acc = user.getuAccountnumber();
        return service.isAccUnique(acc);
    }

    @PostMapping("/User")
    @PassToken
    public void registerUser(@RequestBody User user) {

        System.out.println(user);

//        User user1 = JwtUtil.encodeLoginForm(user.getuPsw());
        //TODO 用户名不存在
//        String acc = user.getuAccountnumber();
//        return service.isAccUnique(acc);
    }
}
