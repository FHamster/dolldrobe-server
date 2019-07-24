package com.fhamster.dolldrobe.controller;

import com.fhamster.dolldrobe.model.Relation.CartSKu;
import com.fhamster.dolldrobe.model.ShoppingCart;
import com.fhamster.dolldrobe.model.ShoppingCartKey;
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

    @PostMapping
    @UserLoginToken
    public boolean addIntoCart(
            @RequestBody ShoppingCart cart
    ) {
        User user = (User) request.getAttribute("user");
        cart.setuAccountnumber(user.getuAccountnumber());
        service.addSC(cart);
        return true;
    }

    @PatchMapping("/Cart")
    @UserLoginToken
    public boolean patchIntoCart(
            @RequestBody ShoppingCart cart
    ) {
        User user = (User) request.getAttribute("user");
        cart.setuAccountnumber(user.getuAccountnumber());

        service.modifySCSelective(cart);
        return true;
    }

    //TODO 这个接口的设计有问题以后要改
    @DeleteMapping("/{SkuId}")
    @UserLoginToken
    public boolean deleteCart(@PathVariable String SkuId) {
        User user = (User) request.getAttribute("user");
        ShoppingCartKey cart = new ShoppingCart();
        cart.setSkuId(SkuId);
        cart.setuAccountnumber(user.getuAccountnumber());

//        System.out.println(cart);
        service.deletSC(cart);
        return true;
    }

    @GetMapping("/Cart")
    @UserLoginToken
    public List<CartSKu> getCart() {
        User user = (User) request.getAttribute("user");

        List<CartSKu> list = service.getCartSKu(user.getuAccountnumber());
        return list;
    }
}
