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
import java.util.stream.Collectors;

@Service
@Transactional
public class QuerySCSService {

    @Autowired
    ShoppingCartMapper scdao;
    @Autowired
    SKUMapper skudao;
//    @Autowired
//    UserMapper userdao;

    /**
     * 输入用户账号获取购物车信息
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
        List<SKU> skuList = skudao.selectByExample(example2);


        //组合cart和SKU
        List<CartSKu> cartSKus = new ArrayList<>();

        CartSKu temp;
        for (ShoppingCart cart : cartList) {
            temp = new CartSKu();
            temp.setCart(cart);

            temp.setSku(
                    skuList.stream().
                            filter(sku -> sku.getSkuId().equals(cart.getSkuId()))
                            .findFirst()
                            .get());
            cartSKus.add(temp);
        }

//        User user = userdao.selectByPrimaryKey(UAcc);
//        user.getuAccountnumber();
        return cartSKus;
    }
}
