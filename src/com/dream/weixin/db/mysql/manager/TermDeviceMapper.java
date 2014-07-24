package com.dream.weixin.db.mysql.manager;

import com.dream.weixin.db.mysql.entity.TermDevice;
import com.dream.weixin.db.mysql.entity.TermDeviceExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TermDeviceMapper {
    int countByExample(TermDeviceExample example);

    int deleteByExample(TermDeviceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TermDevice record);

    int insertSelective(TermDevice record);

    List<TermDevice> selectByExample(TermDeviceExample example);

    TermDevice selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TermDevice record, @Param("example") TermDeviceExample example);

    int updateByExample(@Param("record") TermDevice record, @Param("example") TermDeviceExample example);

    int updateByPrimaryKeySelective(TermDevice record);

    int updateByPrimaryKey(TermDevice record);
}