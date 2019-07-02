package com.fhamster.dolldrobe.controller;

import com.fhamster.dolldrobe.dao.UserMapper;
import com.fhamster.dolldrobe.model.DDToken;
import com.fhamster.dolldrobe.model.User;
import com.fhamster.dolldrobe.service.UserService;
import com.fhamster.dolldrobe.util.JwtUtil;
import com.fhamster.dolldrobe.util.PassToken;
import com.fhamster.dolldrobe.util.UserLoginToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ResourceServerProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@RestController
@RequestMapping("/token")
public class TokenContriller {

    @Autowired
    UserService service;

    @PostMapping("/token")
    @PassToken
    public DDToken getToken(@RequestBody User user, HttpServletResponse response) {
        if (service.isPswMatch(user.getuAccountnumber(), user.getuPsw())) {
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
    @UserLoginToken
    public User getToken2(@RequestBody Map<String, String> map) {

        return new User();
    }


}

