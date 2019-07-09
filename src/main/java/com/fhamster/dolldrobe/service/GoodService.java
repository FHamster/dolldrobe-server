package com.fhamster.dolldrobe.service;

import com.fhamster.dolldrobe.dao.CommodityMapper;
import com.fhamster.dolldrobe.model.Commodity;
import com.fhamster.dolldrobe.model.CommodityExample;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.Collections;
import java.util.List;

/**
 * 商品服务类
 */
@Service
@Transactional
public class GoodService {

    @Autowired
    CommodityMapper dao;


    /**
     * 获取商品页面
     *
     * @param keyWord   关键词
     * @param startPage 开始的page
     * @param pageSize  每页大小
     * @return 商品列表
     */
    public List<Commodity> getGood(String keyWord, int startPage, int pageSize) {
        CommodityExample example = new CommodityExample();
        example.createCriteria()
                .andCNameLike("%" + keyWord + "%");

        PageHelper.startPage(startPage, pageSize, "C_EndTime");
        List<Commodity> list = dao.selectByExampleWithBLOBs(example);

        return list;
    }


    /**
     * @param keyWord   关键词
     * @param startPage 开始的page
     * @param pageSize  每页大小
     * @param order     按照什么字段排序
     * @return 商品列表
     */
    public List<Commodity> getGood(String keyWord, int startPage, int pageSize, String order) {

        CommodityExample example = new CommodityExample();
        example.createCriteria()
                .andCNameLike("%" + keyWord + "%");
        List<Commodity> list;

        PageHelper.startPage(startPage, pageSize, order);
        list = dao.selectByExampleWithBLOBs(example);


        return list;
    }

    /**
     * @param keyWord   关键词
     * @param startPage 开始的page
     * @param pageSize  每页大小
     * @param order     按照什么字段排序
     * @return 商品列表
     */
    public List<Commodity> getGood(String keyWord, int startPage, int pageSize, String order, boolean isAsc) {

        CommodityExample example = new CommodityExample();
        example.createCriteria()
                .andCNameLike("%" + keyWord + "%");
        List<Commodity> list;
        PageHelper.startPage(startPage, pageSize, order);
        list = dao.selectByExampleWithBLOBs(example);


        if (!isAsc) {
            Collections.reverse(list);
        }

        return list;
    }

}
