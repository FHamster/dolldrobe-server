package com.fhamster.dolldrobe.service;

import com.fhamster.dolldrobe.dao.CommodityMapper;
import com.fhamster.dolldrobe.dao.SKUMapper;
import com.fhamster.dolldrobe.dao.ShoppingCartMapper;
import com.fhamster.dolldrobe.dao.UserMapper;
import com.fhamster.dolldrobe.model.*;
import com.fhamster.dolldrobe.model.Relation.CartSKu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class ShopingCartService {

    @Autowired
    ShoppingCartMapper scdao;
    @Autowired
    SKUMapper skudao;
//    @Autowired
//    UserMapper userdao;

    /**
     * 输入用户账号获取购物车信息
     *
     * @param UAcc 用户账号
     * @return 购物车信息
     */
    public List<CartSKu> getCartSKu(String UAcc) {
        //获取该用户的购物车
        ShoppingCartExample example = new ShoppingCartExample();
        example.createCriteria().andUAccountnumberEqualTo(UAcc);
        List<ShoppingCart> cartList = scdao.selectByExample(example);

        //提取该用户购物车内库存id
        List<String> strings = cartList.stream().
                map(ShoppingCartKey::getSkuId).
                collect(Collectors.toList());

        SKUExample example2 = new SKUExample();

        //查询库存
        example2.createCriteria()
                .andSkuIdIn(strings);
        List<SKU> skuList = skudao.selectByExampleWithBLOBs(example2);


        //组合cart和SKU
        List<CartSKu> cartSKus = new ArrayList<>();

        CartSKu temp;
        for (ShoppingCart cart : cartList) {
            temp = new CartSKu();
            temp.setCart(cart);
            Optional<SKU> skuOptional = skuList.stream().
                    filter(sku -> sku.getSkuId().equals(cart.getSkuId()))
                    .findFirst();
            if (skuOptional.isPresent()) {
                temp.setSku(skuOptional.get());
                cartSKus.add(temp);
            }
        }

//        User user = userdao.selectByPrimaryKey(UAcc);
//        user.getuAccountnumber();
        return cartSKus;
    }


    /**
     * 将指定库存商品加入某用户的购物车
     *
     * @param shoppingCart 要加入的购物车记录
     */
    public void insertSC(ShoppingCart shoppingCart) {
        try {
            SKU sku = skudao.selectByPrimaryKey(shoppingCart.getSkuId());
            if (sku == null) {
                throw new Exception("无此库存商品id");
            }
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
     * @param cart 需要删除的购物车信息
     */
    public void deletSC(ShoppingCart cart) {
//        查询到购物车内商品信息
        ShoppingCartKey key = new ShoppingCartKey(cart.getSkuId(), cart.getuAccountnumber());
        scdao.deleteByPrimaryKey(key);
    }

    /**
     * 修改购物车内商品
     * question:修改数量 or 修改类别
     * 解决：先删除原数据，再插入新数据
     *
     * @param cart1 旧cart
     * @param cart2 新cart
     */
    public void modifySC(ShoppingCart cart1, ShoppingCart cart2) {
        ShoppingCartKey key = new ShoppingCartKey(cart1.getSkuId(), cart1.getuAccountnumber());
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
