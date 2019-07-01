package com.fhamster.dolldrobe.dao;

import com.fhamster.dolldrobe.model.SketchSamplelFeedback;
import com.fhamster.dolldrobe.model.SketchSamplelFeedbackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SketchSamplelFeedbackMapper {
    int countByExample(SketchSamplelFeedbackExample example);

    int deleteByExample(SketchSamplelFeedbackExample example);

    int deleteByPrimaryKey(String ssfId);

    int insert(SketchSamplelFeedback record);

    int insertSelective(SketchSamplelFeedback record);

    List<SketchSamplelFeedback> selectByExampleWithBLOBs(SketchSamplelFeedbackExample example);

    List<SketchSamplelFeedback> selectByExample(SketchSamplelFeedbackExample example);

    SketchSamplelFeedback selectByPrimaryKey(String ssfId);

    int updateByExampleSelective(@Param("record") SketchSamplelFeedback record, @Param("example") SketchSamplelFeedbackExample example);

    int updateByExampleWithBLOBs(@Param("record") SketchSamplelFeedback record, @Param("example") SketchSamplelFeedbackExample example);

    int updateByExample(@Param("record") SketchSamplelFeedback record, @Param("example") SketchSamplelFeedbackExample example);

    int updateByPrimaryKeySelective(SketchSamplelFeedback record);

    int updateByPrimaryKeyWithBLOBs(SketchSamplelFeedback record);

    int updateByPrimaryKey(SketchSamplelFeedback record);
}