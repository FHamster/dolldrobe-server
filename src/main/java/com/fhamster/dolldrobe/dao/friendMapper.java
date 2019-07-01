package com.fhamster.dolldrobe.dao;

import com.fhamster.dolldrobe.model.friendExample;
import com.fhamster.dolldrobe.model.friendKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface friendMapper {
    int countByExample(friendExample example);

    int deleteByExample(friendExample example);

    int deleteByPrimaryKey(friendKey key);

    int insert(friendKey record);

    int insertSelective(friendKey record);

    List<friendKey> selectByExample(friendExample example);

    int updateByExampleSelective(@Param("record") friendKey record, @Param("example") friendExample example);

    int updateByExample(@Param("record") friendKey record, @Param("example") friendExample example);
}