package com.fhamster.dolldrobe.service;


import com.fhamster.dolldrobe.dao.AdministrativeRegionMapper;
import com.fhamster.dolldrobe.dao.CommodityMapper;
import com.fhamster.dolldrobe.dao.FPageCommodityMapper;
import com.fhamster.dolldrobe.dao.ShippingAddressMapper;
import com.fhamster.dolldrobe.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@Transactional
public class AddressService {

    @Autowired
    ShippingAddressMapper addressDao;


    @Autowired
    AdministrativeRegionMapper regionDao;

    /**
     * 根据账户用户获取一个用户收获地址列表
     *
     * @param user 查询的用户账号
     * @return 用户的收件地址列表
     */
    public List<ShippingAddress> getAddress(User user) {

        ShippingAddressExample example = new ShippingAddressExample();
        example.createCriteria()
                .andUAccountnumberEqualTo(user.getuAccountnumber());

        return addressDao.selectByExample(example);
    }

    /*
     */

    /**
     * 插入收获地址
     *
     * @param address 要插入收获地址
     */
    public void addAddress(ShippingAddress address) {


        String uuid = UUID.randomUUID().toString();
        address.setSaNum(uuid);
        try {
            addressDao.insertSelective(address);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 通过输入商品id和用户账号，删除对应用户收藏夹中商品
     *
     * @param CNum 用户id
     * @param UAcc 用户账号
     *//*
    public void Del(String CNum, String UAcc) {
        FPageCommodityKey commodityKey = new FPageCommodityKey(CNum, UAcc);
        dao.deleteByPrimaryKey(commodityKey);
    }*/
}
