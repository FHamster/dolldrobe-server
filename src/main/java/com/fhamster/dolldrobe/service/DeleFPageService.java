package com.fhamster.dolldrobe.service;

import com.fhamster.dolldrobe.dao.FPageCommodityMapper;
import com.fhamster.dolldrobe.model.FPageCommodity;
import com.fhamster.dolldrobe.model.FPageCommodityKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DeleFPageService {
    @Autowired
    FPageCommodityMapper dao;

    public void Del(String CNum, String UAcc) {
        FPageCommodityKey commodityKey = new FPageCommodityKey(CNum, UAcc);
        dao.deleteByPrimaryKey(commodityKey);
    }
}
