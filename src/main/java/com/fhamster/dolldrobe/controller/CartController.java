package com.fhamster.dolldrobe.controller;

import com.fhamster.dolldrobe.model.Relation.CartSKu;
import com.fhamster.dolldrobe.model.ShoppingCart;
import com.fhamster.dolldrobe.model.User;
import com.fhamster.dolldrobe.service.ShopingCartService;
import com.fhamster.dolldrobe.util.UserLoginToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/Cart")
public class CartController {

    @Autowired
    ShopingCartService service;
    @Autowired
    HttpServletRequest request;

    @PostMapping("/Cart")
    @UserLoginToken
    public void addIntoCart(
            @RequestBody ShoppingCart cart
    ) {
        User user = (User) request.getAttribute("user");
        cart.setuAccountnumber(user.getuAccountnumber());
        service.insertSC(cart);
    }

    @GetMapping("/Cart")
    @UserLoginToken
    public List<CartSKu> getCart(HttpServletRequest request) {
        User user = (User) request.getAttribute("user");

        List<CartSKu> list = service.getCartSKu(user.getuAccountnumber());
        return list;
    }
}
