package com.dream.weixin.db.mysql.manager;

import com.dream.weixin.db.mysql.entity.PsamPropertyIns;
import com.dream.weixin.db.mysql.entity.PsamPropertyInsExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface PsamPropertyInsMapper {
    int countByExample(PsamPropertyInsExample example);

    int deleteByExample(PsamPropertyInsExample example);

    int deleteByPrimaryKey(Integer psamPropInsId);

    int insert(PsamPropertyIns record);

    int insertSelective(PsamPropertyIns record);

    List<PsamPropertyIns> selectByExample(PsamPropertyInsExample example);

    PsamPropertyIns selectByPrimaryKey(Integer psamPropInsId);

    int updateByExampleSelective(@Param("record") PsamPropertyIns record, @Param("example") PsamPropertyInsExample example);

    int updateByExample(@Param("record") PsamPropertyIns record, @Param("example") PsamPropertyInsExample example);

    int updateByPrimaryKeySelective(PsamPropertyIns record);

    int updateByPrimaryKey(PsamPropertyIns record);
}