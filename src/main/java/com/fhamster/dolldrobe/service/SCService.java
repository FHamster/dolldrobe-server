package com.fhamster.dolldrobe.service;

import com.fhamster.dolldrobe.dao.SKUMapper;
import com.fhamster.dolldrobe.dao.ShoppingCartMapper;
import com.fhamster.dolldrobe.model.*;
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
     * 将指定库存商品加入某用户的购物车
     *
     * @param sku_id  商品库存id
     * @param userAcc 用户账号
     * @param num     商品数量
     */
    public void insertSC(String sku_id, String userAcc, int num) {
        try {
            SKU sku = skudao.selectByPrimaryKey(sku_id);
            if (sku == null) {
                throw new Exception("无此库存商品id");
            }
            ShoppingCart shoppingCart = new ShoppingCart(sku_id, userAcc, num);
            scdao.insert(shoppingCart);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //TODO 库存不足错误抛出至controller
//        if (sku.getcInventory() > 0 && sku.getcInventory() >= num) {
//
//        }
    }

    /**
     * 根据库存商品id，用户账号删除购物车中商品
     *
     * @param sku_id  商品库存id
     * @param userAcc 用户账号
     */
    public void deletSC(String sku_id, String userAcc) {
//        查询到购物车内商品信息
        ShoppingCartKey key = new ShoppingCartKey(sku_id, userAcc);
        scdao.deleteByPrimaryKey(key);
    }

    /**
     * 修改购物车内商品
     * question:修改数量 or 修改类别
     *解决：先删除原数据，再插入新数据
     * @param cart1 旧cart
     * @param cart2 新cart
     */
    public void modifySC(ShoppingCart cart1, ShoppingCart cart2) {
        ShoppingCartKey key = new ShoppingCartKey(cart1.getSkuId(),cart1.getuAccountnumber());
        try {
            if (cart1 == null) {
                throw new Exception("不存在该购物车");
            }
//           删除原购物车商品信息
            scdao.deleteByPrimaryKey(key);
            //插入新商品信息
            scdao.insert(cart2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
