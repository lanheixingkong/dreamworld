package com.dream.weixin.db.mysql.manager;

import com.dream.weixin.db.mysql.entity.PsamProperty;
import com.dream.weixin.db.mysql.entity.PsamPropertyExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface PsamPropertyMapper {
    int countByExample(PsamPropertyExample example);

    int deleteByExample(PsamPropertyExample example);

    int deleteByPrimaryKey(Integer psamPropId);

    int insert(PsamProperty record);

    int insertSelective(PsamProperty record);

    List<PsamProperty> selectByExample(PsamPropertyExample example);

    PsamProperty selectByPrimaryKey(Integer psamPropId);

    int updateByExampleSelective(@Param("record") PsamProperty record, @Param("example") PsamPropertyExample example);

    int updateByExample(@Param("record") PsamProperty record, @Param("example") PsamPropertyExample example);

    int updateByPrimaryKeySelective(PsamProperty record);

    int updateByPrimaryKey(PsamProperty record);
}