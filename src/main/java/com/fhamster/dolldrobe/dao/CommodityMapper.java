package com.fhamster.dolldrobe.dao;

import com.fhamster.dolldrobe.model.Commodity;
import com.fhamster.dolldrobe.model.CommodityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommodityMapper {
    int countByExample(CommodityExample example);

    int deleteByExample(CommodityExample example);

    int deleteByPrimaryKey(String cNum);

    int insert(Commodity record);

    int insertSelective(Commodity record);

    List<Commodity> selectByExample(CommodityExample example);

    Commodity selectByPrimaryKey(String cNum);

    int updateByExampleSelective(@Param("record") Commodity record, @Param("example") CommodityExample example);

    int updateByExample(@Param("record") Commodity record, @Param("example") CommodityExample example);

    int updateByPrimaryKeySelective(Commodity record);

    int updateByPrimaryKey(Commodity record);
}