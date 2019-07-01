package com.fhamster.dolldrobe.dao;

import com.fhamster.dolldrobe.model.ShoppingCart;
import com.fhamster.dolldrobe.model.ShoppingCartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShoppingCartMapper {
    int countByExample(ShoppingCartExample example);

    int deleteByExample(ShoppingCartExample example);

    int deleteByPrimaryKey(String uAccountnumber);

    int insert(ShoppingCart record);

    int insertSelective(ShoppingCart record);

    List<ShoppingCart> selectByExample(ShoppingCartExample example);

    ShoppingCart selectByPrimaryKey(String uAccountnumber);

    int updateByExampleSelective(@Param("record") ShoppingCart record, @Param("example") ShoppingCartExample example);

    int updateByExample(@Param("record") ShoppingCart record, @Param("example") ShoppingCartExample example);

    int updateByPrimaryKeySelective(ShoppingCart record);

    int updateByPrimaryKey(ShoppingCart record);
}