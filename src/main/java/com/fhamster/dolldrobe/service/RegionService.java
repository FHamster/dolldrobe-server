package com.fhamster.dolldrobe.service;

import com.fhamster.dolldrobe.dao.AdministrativeRegionMapper;
import com.fhamster.dolldrobe.model.AdministrativeRegion;
import com.fhamster.dolldrobe.model.AdministrativeRegionExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

@Service
@Transactional
public class RegionService {

    @Autowired
    AdministrativeRegionMapper dao;

    /**
     * 根据父区域id获取下属区域信息
     *
     * @param region 传入上级区域
     * @return 下属区域的列表
     * <p>
     * 传入福建省
     * 传出厦门市，泉州市...
     */
    public List<AdministrativeRegion> getRegionByPrentId(AdministrativeRegion region) {

        AdministrativeRegionExample example = new AdministrativeRegionExample();
        example.createCriteria()
                .andArPrentNumEqualTo(region.getArNum());

        return dao.selectByExample(example);


    }

    /**
     * 根据区域id获取区域信息
     *
     * @param region 传入上级区域
     * @return 下属区域的列表
     * <p>
     * 传入福建省
     * 传出厦门市，泉州市...
     */
    public List<AdministrativeRegion> getRegionRootNameById(AdministrativeRegion region) {

        Stack<AdministrativeRegion> regionLiStack = new Stack<>();
        AdministrativeRegion test;
        try {

            test = dao.selectByPrimaryKey(region.getArNum());
            if (test == null) {
                throw new Exception("不存在的区域编号");
            }

            while (test != null) {
                regionLiStack.push(test);
                test = dao.selectByPrimaryKey(test.getArPrentNum());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        return new ArrayList<>(regionLiStack);
    }

}
