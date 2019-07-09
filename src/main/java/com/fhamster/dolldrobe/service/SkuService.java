package com.fhamster.dolldrobe.service;

import com.fhamster.dolldrobe.dao.SKUMapper;
import com.fhamster.dolldrobe.model.SKU;
import com.fhamster.dolldrobe.model.SKUExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SkuService {

    @Autowired
    SKUMapper dao;

    /**
     * 通过商品id获取该商品的库存信息
     * @param CNum 商品id
     * @return 查询到的商品信息
     */
    public List<SKU> getSkuByCNum(String CNum) {
        SKUExample example = new SKUExample();
        example.createCriteria()
                .andCNumEqualTo(CNum);
        return dao.selectByExampleWithBLOBs(example);
    }
}
