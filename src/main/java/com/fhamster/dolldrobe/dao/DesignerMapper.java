package com.fhamster.dolldrobe.dao;

import com.fhamster.dolldrobe.model.Designer;
import com.fhamster.dolldrobe.model.DesignerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DesignerMapper {
    int countByExample(DesignerExample example);

    int deleteByExample(DesignerExample example);

    int deleteByPrimaryKey(String uAccountnumber);

    int insert(Designer record);

    int insertSelective(Designer record);

    List<Designer> selectByExampleWithBLOBs(DesignerExample example);

    List<Designer> selectByExample(DesignerExample example);

    Designer selectByPrimaryKey(String uAccountnumber);

    int updateByExampleSelective(@Param("record") Designer record, @Param("example") DesignerExample example);

    int updateByExampleWithBLOBs(@Param("record") Designer record, @Param("example") DesignerExample example);

    int updateByExample(@Param("record") Designer record, @Param("example") DesignerExample example);

    int updateByPrimaryKeySelective(Designer record);

    int updateByPrimaryKeyWithBLOBs(Designer record);

    int updateByPrimaryKey(Designer record);
}