package com.fhamster.dolldrobe.service;


import com.fhamster.dolldrobe.dao.CommodityMapper;
import com.fhamster.dolldrobe.dao.FPageCommodityMapper;
import com.fhamster.dolldrobe.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class FPageService {
    @Autowired
    FPageCommodityMapper dao;

    @Autowired
    CommodityMapper comdao;

    /**
     * 根据账户用户获取一个用户收藏夹
     *
     * @param UAcc 用户账号
     * @return 收藏夹表
     */
    public List<Commodity> getCom(String UAcc) {

        FPageCommodityExample example = new FPageCommodityExample();
        example.createCriteria()
                .andUAccountnumberEqualTo(UAcc);

        List<String> strings =
                dao.selectByExample(example).stream()
                        .map(FPageCommodity::getcNum)
                        .collect(Collectors.toList());
        CommodityExample example1 = new CommodityExample();
        example1.createCriteria().andCNumIn(strings);

        return comdao.selectByExample(example1);
    }


    /**
     * date获取当前时间
     * 插入商品
     *
     * @param UAcc 用户账号
     * @param CNum 商品id
     */
    public void InsertFPage(String UAcc, String CNum) {
        //获取当前日期
        Date date = new Date();
        //设置要获取到什么样的时间
        // SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //获取String类型的时间
//        String d = sdf.format(date);
        FPageCommodity commodity = new FPageCommodity(CNum, UAcc, date);
        dao.insert(commodity);
    }

    /**
     * 通过输入商品id和用户账号，删除对应用户收藏夹中商品
     *
     * @param CNum 用户id
     * @param UAcc 用户账号
     */
    public void Del(String CNum, String UAcc) {
        FPageCommodityKey commodityKey = new FPageCommodityKey(CNum, UAcc);
        dao.deleteByPrimaryKey(commodityKey);
    }
}
