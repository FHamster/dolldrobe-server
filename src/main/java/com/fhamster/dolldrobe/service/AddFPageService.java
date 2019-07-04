package com.fhamster.dolldrobe.service;

import com.fhamster.dolldrobe.dao.CommodityMapper;
import com.fhamster.dolldrobe.dao.FPageCommodityMapper;
import com.fhamster.dolldrobe.model.FPageCommodity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.tools.JavaCompiler;
import java.util.Date;
import java.text.SimpleDateFormat;
@Service
@Transactional

//todo 能用
public class AddFPageService {
    @Autowired
    FPageCommodityMapper Fdao;
//    @Autowired
//    CommodityMapper Cdao;

    public void InsertFPage(String UAcc,String CNum) {
        //获取当前日期
        Date date = new Date();
        //设置要获取到什么样的时间
       // SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //获取String类型的时间
//        String d = sdf.format(date);
        FPageCommodity commodity = new FPageCommodity(CNum,UAcc,date);
        Fdao.insert(commodity);
    }
}
