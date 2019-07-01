package com.fhamster.dolldrobe.dao;

import com.fhamster.dolldrobe.model.SketchPic;
import com.fhamster.dolldrobe.model.SketchPicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SketchPicMapper {
    int countByExample(SketchPicExample example);

    int deleteByExample(SketchPicExample example);

    int deleteByPrimaryKey(String spId);

    int insert(SketchPic record);

    int insertSelective(SketchPic record);

    List<SketchPic> selectByExampleWithBLOBs(SketchPicExample example);

    List<SketchPic> selectByExample(SketchPicExample example);

    SketchPic selectByPrimaryKey(String spId);

    int updateByExampleSelective(@Param("record") SketchPic record, @Param("example") SketchPicExample example);

    int updateByExampleWithBLOBs(@Param("record") SketchPic record, @Param("example") SketchPicExample example);

    int updateByExample(@Param("record") SketchPic record, @Param("example") SketchPicExample example);

    int updateByPrimaryKeySelective(SketchPic record);

    int updateByPrimaryKeyWithBLOBs(SketchPic record);

    int updateByPrimaryKey(SketchPic record);
}