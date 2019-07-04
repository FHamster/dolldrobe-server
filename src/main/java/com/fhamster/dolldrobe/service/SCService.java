package com.fhamster.dolldrobe.service;

import com.fhamster.dolldrobe.dao.SKUMapper;
import com.fhamster.dolldrobe.dao.ShoppingCartMapper;
import com.fhamster.dolldrobe.model.SKU;
import com.fhamster.dolldrobe.model.SKUExample;
import com.fhamster.dolldrobe.model.ShoppingCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SCService {

    @Autowired
    SKUMapper skudao;

    @Autowired
    ShoppingCartMapper scdao;

    /**
     * 将指定库存加入某用户的购物车
     *
     * @return
     */
    public void insertSC(String skuid, String userAcc, int num) {

        SKU sku = skudao.selectByPrimaryKey(skuid);

        //TODO 库存不足错误抛出至controller
        if (sku.getcInventory() > 0 && sku.getcInventory() >= num) {
            ShoppingCart shoppingCart = new ShoppingCart(skuid, userAcc, num);
            scdao.insert(shoppingCart);
        }
    }

}
