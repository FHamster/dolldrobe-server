package com.fhamster.dolldrobe.controller;

import com.fhamster.dolldrobe.model.Commodity;
import com.fhamster.dolldrobe.model.User;
import com.fhamster.dolldrobe.service.FPageService;
import com.fhamster.dolldrobe.util.UserLoginToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/Favorities")
public class FavoritiesController {

    @Autowired
    FPageService service;

    @GetMapping("/Favorities")
    @UserLoginToken
    public List<Commodity> getFavorities(
            HttpServletRequest request
    ) {

        User user = (User) request.getAttribute("user");


        return service.getCom(user.getuAccountnumber());


    }

    @PostMapping("/addFavorities")
    @UserLoginToken
    public void addFavorities(
            HttpServletRequest request,
           @RequestBody Commodity commodity
    ) {

        User user = (User) request.getAttribute("user");


        service.InsertFPage(user.getuAccountnumber(), commodity.getcNum());


    }
}
