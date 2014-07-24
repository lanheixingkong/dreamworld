package com.dream.weixin.db.mysql.manager;

import com.dream.weixin.db.mysql.entity.Sms;
import com.dream.weixin.db.mysql.entity.SmsExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SmsMapper {
    int countByExample(SmsExample example);

    int deleteByExample(SmsExample example);

    int deleteByPrimaryKey(Integer smsId);

    int insert(Sms record);

    int insertSelective(Sms record);

    List<Sms> selectByExample(SmsExample example);

    Sms selectByPrimaryKey(Integer smsId);

    int updateByExampleSelective(@Param("record") Sms record, @Param("example") SmsExample example);

    int updateByExample(@Param("record") Sms record, @Param("example") SmsExample example);

    int updateByPrimaryKeySelective(Sms record);

    int updateByPrimaryKey(Sms record);
}