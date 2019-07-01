package com.fhamster.dolldrobe.dao;

import com.fhamster.dolldrobe.model.ShippingAddress;
import com.fhamster.dolldrobe.model.ShippingAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShippingAddressMapper {
    int countByExample(ShippingAddressExample example);

    int deleteByExample(ShippingAddressExample example);

    int deleteByPrimaryKey(String saNum);

    int insert(ShippingAddress record);

    int insertSelective(ShippingAddress record);

    List<ShippingAddress> selectByExample(ShippingAddressExample example);

    ShippingAddress selectByPrimaryKey(String saNum);

    int updateByExampleSelective(@Param("record") ShippingAddress record, @Param("example") ShippingAddressExample example);

    int updateByExample(@Param("record") ShippingAddress record, @Param("example") ShippingAddressExample example);

    int updateByPrimaryKeySelective(ShippingAddress record);

    int updateByPrimaryKey(ShippingAddress record);
}