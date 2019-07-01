package com.fhamster.dolldrobe.dao;

import com.fhamster.dolldrobe.model.AdministrativeRegion;
import com.fhamster.dolldrobe.model.AdministrativeRegionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdministrativeRegionMapper {
    int countByExample(AdministrativeRegionExample example);

    int deleteByExample(AdministrativeRegionExample example);

    int deleteByPrimaryKey(String arNum);

    int insert(AdministrativeRegion record);

    int insertSelective(AdministrativeRegion record);

    List<AdministrativeRegion> selectByExample(AdministrativeRegionExample example);

    AdministrativeRegion selectByPrimaryKey(String arNum);

    int updateByExampleSelective(@Param("record") AdministrativeRegion record, @Param("example") AdministrativeRegionExample example);

    int updateByExample(@Param("record") AdministrativeRegion record, @Param("example") AdministrativeRegionExample example);

    int updateByPrimaryKeySelective(AdministrativeRegion record);

    int updateByPrimaryKey(AdministrativeRegion record);
}