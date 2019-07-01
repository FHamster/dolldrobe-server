package com.fhamster.dolldrobe.dao;

import com.fhamster.dolldrobe.model.Sketch;
import com.fhamster.dolldrobe.model.SketchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SketchMapper {
    int countByExample(SketchExample example);

    int deleteByExample(SketchExample example);

    int deleteByPrimaryKey(String sNum);

    int insert(Sketch record);

    int insertSelective(Sketch record);

    List<Sketch> selectByExample(SketchExample example);

    Sketch selectByPrimaryKey(String sNum);

    int updateByExampleSelective(@Param("record") Sketch record, @Param("example") SketchExample example);

    int updateByExample(@Param("record") Sketch record, @Param("example") SketchExample example);

    int updateByPrimaryKeySelective(Sketch record);

    int updateByPrimaryKey(Sketch record);
}