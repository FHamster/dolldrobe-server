package com.fhamster.dolldrobe.dao;

import com.fhamster.dolldrobe.model.FPageCommodity;
import com.fhamster.dolldrobe.model.FPageCommodityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FPageCommodityMapper {
    int countByExample(FPageCommodityExample example);

    int deleteByExample(FPageCommodityExample example);

    int deleteByPrimaryKey(String uAccountnumber);

    int insert(FPageCommodity record);

    int insertSelective(FPageCommodity record);

    List<FPageCommodity> selectByExample(FPageCommodityExample example);

    FPageCommodity selectByPrimaryKey(String uAccountnumber);

    int updateByExampleSelective(@Param("record") FPageCommodity record, @Param("example") FPageCommodityExample example);

    int updateByExample(@Param("record") FPageCommodity record, @Param("example") FPageCommodityExample example);

    int updateByPrimaryKeySelective(FPageCommodity record);

    int updateByPrimaryKey(FPageCommodity record);
}