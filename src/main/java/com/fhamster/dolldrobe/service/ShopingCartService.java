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
     * 将指定库存商品加入某用户的购物
     *
     * @param shoppingCart 要加入的购物车记录
     */
    public void addSC(ShoppingCart shoppingCart) {

        //检查库存内有没有该商品
        //检查用户购物车内有没有该商品

        try {
            //检查库存内有没有该商品
            SKU sku = skudao.selectByPrimaryKey(shoppingCart.getSkuId());
            if (sku == null) {
                throw new Exception("无此库存商品id");
            }

            //检查用户购物车内有没有该商品
            ShoppingCartKey key = shoppingCart;
            ShoppingCart test = scdao.selectByPrimaryKey(key);
            if (test == null) {
                //没有的话就插入购物车记录
                scdao.insertSelective(shoppingCart);
            } else {
                //有的话就数量相加
                shoppingCart.setScNum(shoppingCart.getScNum() + test.getScNum());
                scdao.updateByPrimaryKeySelective(shoppingCart);
            }
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
     * @deprecated 少用吧，传入数据不标准
     */
    public void addSC(String sku_id, String userAcc, int num) {
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
        try {
            //查询到购物车内商品信息
            if (scdao.selectByPrimaryKey(cart) == null) {
                throw new Exception("该用户购物车中没有这个商品");
            }

            scdao.deleteByPrimaryKey(cart);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ShoppingCartKey key = new ShoppingCartKey(cart.getSkuId(), cart.getuAccountnumber());
        scdao.deleteByPrimaryKey(key);
    }

    /**
     * 修改购物车内商品
     * question:修改数量 or 修改类别
     * 解决：先删除原数据，再插入新数据
     *
     * @param cart 修改后的cart
     */
    public void modifySCSelective(ShoppingCart cart) {

        try {
            if (scdao.selectByPrimaryKey(cart) == null) {
                throw new Exception("用户购物车不存在该商品");
            }
            //修改原购物车商品信息
            scdao.updateByPrimaryKeySelective(cart);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

