package com.dream.weixin.db.mysql.manager;

import com.dream.weixin.db.mysql.entity.OpenidPsam;
import com.dream.weixin.db.mysql.entity.OpenidPsamExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface OpenidPsamMapper {
    int countByExample(OpenidPsamExample example);

    int deleteByExample(OpenidPsamExample example);

    int deleteByPrimaryKey(Integer openidPsamId);

    int insert(OpenidPsam record);

    int insertSelective(OpenidPsam record);

    List<OpenidPsam> selectByExample(OpenidPsamExample example);

    OpenidPsam selectByPrimaryKey(Integer openidPsamId);

    int updateByExampleSelective(@Param("record") OpenidPsam record, @Param("example") OpenidPsamExample example);

    int updateByExample(@Param("record") OpenidPsam record, @Param("example") OpenidPsamExample example);

    int updateByPrimaryKeySelective(OpenidPsam record);

    int updateByPrimaryKey(OpenidPsam record);
}