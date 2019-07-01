package com.fhamster.dolldrobe.dao;

import com.fhamster.dolldrobe.model.BasicOrder;
import com.fhamster.dolldrobe.model.BasicOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasicOrderMapper {
    int countByExample(BasicOrderExample example);

    int deleteByExample(BasicOrderExample example);

    int deleteByPrimaryKey(String oNum);

    int insert(BasicOrder record);

    int insertSelective(BasicOrder record);

    List<BasicOrder> selectByExample(BasicOrderExample example);

    BasicOrder selectByPrimaryKey(String oNum);

    int updateByExampleSelective(@Param("record") BasicOrder record, @Param("example") BasicOrderExample example);

    int updateByExample(@Param("record") BasicOrder record, @Param("example") BasicOrderExample example);

    int updateByPrimaryKeySelective(BasicOrder record);

    int updateByPrimaryKey(BasicOrder record);
}