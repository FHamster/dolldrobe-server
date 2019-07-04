package com.fhamster.dolldrobe.controller;

import com.fhamster.dolldrobe.model.Commodity;
import com.fhamster.dolldrobe.model.User;
import com.fhamster.dolldrobe.service.GoodService;
import com.fhamster.dolldrobe.util.PassToken;
import com.fhamster.dolldrobe.util.UserLoginToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/GoodPage")
@PassToken
public class GoodController {

    @Autowired
    GoodService service;

    /**
     * 获取商品页面
     *
     * @param request   当前的request
     * @param keyWord   关键词
     * @param startPage 开始的page
     * @param pageSize  每页大小
     * @return List 商品列表
     */
    @GetMapping("/GoodPage")
    @UserLoginToken
    public List<Commodity> getGoodPage(
            HttpServletRequest request,
            @RequestParam(required = false, defaultValue = "") String keyWord,
            @RequestParam(required = false, defaultValue = "1") int startPage,
            @RequestParam(required = false, defaultValue = "5") int pageSize
    ) {

        User user = (User) request.getAttribute("user");
        System.out.println(user.getuAccountnumber());
        return service.getGood(keyWord, startPage, pageSize);
    }

    /**
     * 按照商品字段排序排序
     *
     * @param keyWord   关键词
     * @param startPage 开始的page
     * @param pageSize  每页大小
     * @param order     按照order字段排序
     * @param isAsc     是否正序
     * @return List 商品列表
     */
    @GetMapping("/GoodPageByOrder")
    public List<Commodity> getGoodPageByOrder(
            @RequestParam(required = false, defaultValue = "") String keyWord,
            @RequestParam(required = false, defaultValue = "1") int startPage,
            @RequestParam(required = false, defaultValue = "5") int pageSize,
            @RequestParam String order,
            @RequestParam(required = false, defaultValue = "true") boolean isAsc
    ) {


        //TODO order字段检查
        return service.getGood(keyWord, startPage, pageSize, order, isAsc);
    }


}

