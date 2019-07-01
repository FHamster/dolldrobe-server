package com.fhamster.dolldrobe.dao;

import com.fhamster.dolldrobe.model.InOrderDetail;
import com.fhamster.dolldrobe.model.InOrderDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InOrderDetailMapper {
    int countByExample(InOrderDetailExample example);

    int deleteByExample(InOrderDetailExample example);

    int deleteByPrimaryKey(String iId);

    int insert(InOrderDetail record);

    int insertSelective(InOrderDetail record);

    List<InOrderDetail> selectByExample(InOrderDetailExample example);

    InOrderDetail selectByPrimaryKey(String iId);

    int updateByExampleSelective(@Param("record") InOrderDetail record, @Param("example") InOrderDetailExample example);

    int updateByExample(@Param("record") InOrderDetail record, @Param("example") InOrderDetailExample example);

    int updateByPrimaryKeySelective(InOrderDetail record);

    int updateByPrimaryKey(InOrderDetail record);
}