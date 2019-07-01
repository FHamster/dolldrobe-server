package com.fhamster.dolldrobe.dao;

import com.fhamster.dolldrobe.model.attractExample;
import com.fhamster.dolldrobe.model.attractKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface attractMapper {
    int countByExample(attractExample example);

    int deleteByExample(attractExample example);

    int deleteByPrimaryKey(attractKey key);

    int insert(attractKey record);

    int insertSelective(attractKey record);

    List<attractKey> selectByExample(attractExample example);

    int updateByExampleSelective(@Param("record") attractKey record, @Param("example") attractExample example);

    int updateByExample(@Param("record") attractKey record, @Param("example") attractExample example);
}