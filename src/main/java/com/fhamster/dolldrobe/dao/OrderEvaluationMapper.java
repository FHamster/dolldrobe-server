package com.fhamster.dolldrobe.dao;

import com.fhamster.dolldrobe.model.OrderEvaluation;
import com.fhamster.dolldrobe.model.OrderEvaluationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderEvaluationMapper {
    int countByExample(OrderEvaluationExample example);

    int deleteByExample(OrderEvaluationExample example);

    int deleteByPrimaryKey(String oNum);

    int insert(OrderEvaluation record);

    int insertSelective(OrderEvaluation record);

    List<OrderEvaluation> selectByExampleWithBLOBs(OrderEvaluationExample example);

    List<OrderEvaluation> selectByExample(OrderEvaluationExample example);

    OrderEvaluation selectByPrimaryKey(String oNum);

    int updateByExampleSelective(@Param("record") OrderEvaluation record, @Param("example") OrderEvaluationExample example);

    int updateByExampleWithBLOBs(@Param("record") OrderEvaluation record, @Param("example") OrderEvaluationExample example);

    int updateByExample(@Param("record") OrderEvaluation record, @Param("example") OrderEvaluationExample example);

    int updateByPrimaryKeySelective(OrderEvaluation record);

    int updateByPrimaryKeyWithBLOBs(OrderEvaluation record);

    int updateByPrimaryKey(OrderEvaluation record);
}