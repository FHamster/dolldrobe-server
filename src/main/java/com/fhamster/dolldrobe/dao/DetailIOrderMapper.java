package com.fhamster.dolldrobe.dao;

import com.fhamster.dolldrobe.model.DetailIOrder;
import com.fhamster.dolldrobe.model.DetailIOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DetailIOrderMapper {
    int countByExample(DetailIOrderExample example);

    int deleteByExample(DetailIOrderExample example);

    int deleteByPrimaryKey(String oNum);

    int insert(DetailIOrder record);

    int insertSelective(DetailIOrder record);

    List<DetailIOrder> selectByExample(DetailIOrderExample example);

    DetailIOrder selectByPrimaryKey(String oNum);

    int updateByExampleSelective(@Param("record") DetailIOrder record, @Param("example") DetailIOrderExample example);

    int updateByExample(@Param("record") DetailIOrder record, @Param("example") DetailIOrderExample example);

    int updateByPrimaryKeySelective(DetailIOrder record);

    int updateByPrimaryKey(DetailIOrder record);
}