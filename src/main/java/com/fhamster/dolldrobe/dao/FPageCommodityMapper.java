package com.fhamster.dolldrobe.dao;

import com.fhamster.dolldrobe.model.FPageCommodity;
import com.fhamster.dolldrobe.model.FPageCommodityExample;
import com.fhamster.dolldrobe.model.FPageCommodityKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FPageCommodityMapper {
    int countByExample(FPageCommodityExample example);

    int deleteByExample(FPageCommodityExample example);

    int deleteByPrimaryKey(FPageCommodityKey key);

    int insert(FPageCommodity record);

    int insertSelective(FPageCommodity record);

    List<FPageCommodity> selectByExample(FPageCommodityExample example);

    FPageCommodity selectByPrimaryKey(FPageCommodityKey key);

    int updateByExampleSelective(@Param("record") FPageCommodity record, @Param("example") FPageCommodityExample example);

    int updateByExample(@Param("record") FPageCommodity record, @Param("example") FPageCommodityExample example);

    int updateByPrimaryKeySelective(FPageCommodity record);

    int updateByPrimaryKey(FPageCommodity record);
}