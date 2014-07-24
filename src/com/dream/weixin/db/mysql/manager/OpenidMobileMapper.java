package com.dream.weixin.db.mysql.manager;

import com.dream.weixin.db.mysql.entity.OpenidMobile;
import com.dream.weixin.db.mysql.entity.OpenidMobileExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface OpenidMobileMapper {
    int countByExample(OpenidMobileExample example);

    int deleteByExample(OpenidMobileExample example);

    int deleteByPrimaryKey(Integer mobileOpenId);

    int insert(OpenidMobile record);

    int insertSelective(OpenidMobile record);

    List<OpenidMobile> selectByExample(OpenidMobileExample example);

    OpenidMobile selectByPrimaryKey(Integer mobileOpenId);

    int updateByExampleSelective(@Param("record") OpenidMobile record, @Param("example") OpenidMobileExample example);

    int updateByExample(@Param("record") OpenidMobile record, @Param("example") OpenidMobileExample example);

    int updateByPrimaryKeySelective(OpenidMobile record);

    int updateByPrimaryKey(OpenidMobile record);
}