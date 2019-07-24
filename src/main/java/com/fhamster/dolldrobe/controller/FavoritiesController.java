package com.fhamster.dolldrobe.controller;

import com.fhamster.dolldrobe.model.Commodity;
import com.fhamster.dolldrobe.model.FPageCommodity;
import com.fhamster.dolldrobe.model.User;
import com.fhamster.dolldrobe.service.FPageService;
import com.fhamster.dolldrobe.util.UserLoginToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
            HttpServletResponse response,
            @RequestBody Commodity commodity
    ) throws Exception {

        User user = (User) request.getAttribute("user");

        FPageCommodity fPageCommodity = new FPageCommodity();
        fPageCommodity.setcNum(commodity.getcNum());
        fPageCommodity.setuAccountnumber(user.getuAccountnumber());

        try {

            service.InsertFPage(fPageCommodity);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            response.sendError(HttpServletResponse.SC_NOT_IMPLEMENTED, e.getMessage());
        }
    }
}
