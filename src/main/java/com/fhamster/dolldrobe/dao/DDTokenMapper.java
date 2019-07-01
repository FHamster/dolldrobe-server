package com.fhamster.dolldrobe.dao;

import com.fhamster.dolldrobe.model.DDToken;
import com.fhamster.dolldrobe.model.DDTokenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DDTokenMapper {
    int countByExample(DDTokenExample example);

    int deleteByExample(DDTokenExample example);

    int deleteByPrimaryKey(String tokenid);

    int insert(DDToken record);

    int insertSelective(DDToken record);

    List<DDToken> selectByExample(DDTokenExample example);

    DDToken selectByPrimaryKey(String tokenid);

    int updateByExampleSelective(@Param("record") DDToken record, @Param("example") DDTokenExample example);

    int updateByExample(@Param("record") DDToken record, @Param("example") DDTokenExample example);

    int updateByPrimaryKeySelective(DDToken record);

    int updateByPrimaryKey(DDToken record);
}