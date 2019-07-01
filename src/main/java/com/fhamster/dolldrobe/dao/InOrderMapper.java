package com.fhamster.dolldrobe.dao;

import com.fhamster.dolldrobe.model.InOrder;
import com.fhamster.dolldrobe.model.InOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InOrderMapper {
    int countByExample(InOrderExample example);

    int deleteByExample(InOrderExample example);

    int deleteByPrimaryKey(String iId);

    int insert(InOrder record);

    int insertSelective(InOrder record);

    List<InOrder> selectByExample(InOrderExample example);

    InOrder selectByPrimaryKey(String iId);

    int updateByExampleSelective(@Param("record") InOrder record, @Param("example") InOrderExample example);

    int updateByExample(@Param("record") InOrder record, @Param("example") InOrderExample example);

    int updateByPrimaryKeySelective(InOrder record);

    int updateByPrimaryKey(InOrder record);
}