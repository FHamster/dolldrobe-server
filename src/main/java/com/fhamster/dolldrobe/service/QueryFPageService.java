package com.fhamster.dolldrobe.service;


import com.fhamster.dolldrobe.dao.FPageCommodityMapper;
import com.fhamster.dolldrobe.model.FPageCommodityKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
//不知道，查询的看不出来
public class QueryFPageService {
    @Autowired
    FPageCommodityMapper dao;

    /**
     *
     * @param CNum
     * @param UAcc
     */
    public void Query(String CNum, String UAcc) {
        FPageCommodityKey commodityKey = new FPageCommodityKey(CNum, UAcc);
        dao.selectByPrimaryKey(commodityKey);
    }
}
