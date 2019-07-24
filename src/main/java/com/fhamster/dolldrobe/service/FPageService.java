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

        return comdao.selectByExampleWithBLOBs(example1);
    }


    /**
     * 插入商品
     *
     * @param fPageCommodity 要插入收藏记录
     */
    public void InsertFPage(FPageCommodity fPageCommodity) throws Exception {
        //获取当前日期
        Date date = new Date();
        fPageCommodity.setFgDate(date);

        System.out.println(fPageCommodity.getcNum());

        //检查商品表参照完整性
        Commodity comTest = comdao.selectByPrimaryKey(fPageCommodity.getcNum());
        //检查商品表实体完整性
        FPageCommodity test = dao.selectByPrimaryKey(fPageCommodity);

        if (comTest == null) {
            throw new Exception("该商品不存在");
        }
        if (test != null) {
            throw new Exception("这件商品已经被收藏了");
        }
        dao.insertSelective(fPageCommodity);


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
