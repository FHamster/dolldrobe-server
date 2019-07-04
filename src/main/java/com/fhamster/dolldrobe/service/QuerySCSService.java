package com.fhamster.dolldrobe.service;

import com.fhamster.dolldrobe.dao.ShoppingCartMapper;
import com.fhamster.dolldrobe.dao.UserMapper;
import com.fhamster.dolldrobe.model.ShoppingCart;
import com.fhamster.dolldrobe.model.ShoppingCartExample;
import com.fhamster.dolldrobe.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
//不能用
public class QuerySCSService {
    @Autowired
    ShoppingCartMapper scdao;
//    @Autowired
//    UserMapper userdao;

    public List<ShoppingCart> getSC(String UAcc) {
        ShoppingCartExample example= new ShoppingCartExample();
        example.createCriteria().andUAccountnumberEqualTo(UAcc);
        List<ShoppingCart> list = scdao.selectByExample(example);

//        User user = userdao.selectByPrimaryKey(UAcc);
//        user.getuAccountnumber();
        return list;
    }
}
