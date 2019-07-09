package com.fhamster.dolldrobe.dao;

import com.fhamster.dolldrobe.model.SKU;
import com.fhamster.dolldrobe.model.SKUExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SKUMapper {
    int countByExample(SKUExample example);

    int deleteByExample(SKUExample example);

    int deleteByPrimaryKey(String skuId);

    int insert(SKU record);

    int insertSelective(SKU record);

    List<SKU> selectByExampleWithBLOBs(SKUExample example);

    List<SKU> selectByExample(SKUExample example);

    SKU selectByPrimaryKey(String skuId);

    int updateByExampleSelective(@Param("record") SKU record, @Param("example") SKUExample example);

    int updateByExampleWithBLOBs(@Param("record") SKU record, @Param("example") SKUExample example);

    int updateByExample(@Param("record") SKU record, @Param("example") SKUExample example);

    int updateByPrimaryKeySelective(SKU record);

    int updateByPrimaryKeyWithBLOBs(SKU record);

    int updateByPrimaryKey(SKU record);
}