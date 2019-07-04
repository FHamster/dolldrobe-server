package com.fhamster.dolldrobe.controller;

import com.fhamster.dolldrobe.model.DDToken;
import com.fhamster.dolldrobe.model.User;
import com.fhamster.dolldrobe.service.UserService;
import com.fhamster.dolldrobe.util.JwtUtil;
import com.fhamster.dolldrobe.util.PassToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@RestController
@RequestMapping("/token")
public class LoginContriller {

    @Autowired
    UserService service;

    @PostMapping("/token")
    @PassToken
    public DDToken getToken(@RequestBody User user, HttpServletResponse response) {
//        User user1 = JwtUtil.encodeLoginForm(user.getuPsw());

        String acc = user.getuAccountnumber();
        String psw = user.getuPsw();


        if (service.isPswMatch(acc, psw)) {
            DDToken token = new DDToken();
            token.setuAccountnumber(user.getuAccountnumber());
            token.setTokenid(JwtUtil.generateToken(user.getuAccountnumber()));
            return token;
        } else {
            try {
                response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "password invalid");
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }

    }

    @PostMapping("/checktoken")
    @PassToken
    public User getToken2(@RequestBody Map<String, String> map) {

        return new User();
    }


}

