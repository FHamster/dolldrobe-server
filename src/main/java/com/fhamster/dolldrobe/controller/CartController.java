package com.fhamster.dolldrobe.controller;

import com.fhamster.dolldrobe.model.Relation.CartSKu;
import com.fhamster.dolldrobe.model.User;
import com.fhamster.dolldrobe.service.QuerySCSService;
import com.fhamster.dolldrobe.util.UserLoginToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/Cart")
public class CartController {

    @Autowired
    QuerySCSService service;

    @GetMapping("/Cart")
    @UserLoginToken
    public List<CartSKu> getGoodPage(HttpServletRequest request) {

        User user = (User) request.getAttribute("user");


        return service.getCartSKu(user.getuAccountnumber());


    }
}
