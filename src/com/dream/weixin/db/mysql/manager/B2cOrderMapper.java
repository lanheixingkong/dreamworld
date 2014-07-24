package com.dream.weixin.db.mysql.manager;

import com.dream.weixin.db.mysql.entity.B2cOrder;
import com.dream.weixin.db.mysql.entity.B2cOrderExample;
import com.dream.weixin.db.mysql.entity.B2cOrderWithBLOBs;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface B2cOrderMapper {
    int countByExample(B2cOrderExample example);

    int deleteByExample(B2cOrderExample example);

    int deleteByPrimaryKey(Long orderId);

    int insert(B2cOrderWithBLOBs record);

    int insertSelective(B2cOrderWithBLOBs record);

    List<B2cOrderWithBLOBs> selectByExampleWithBLOBs(B2cOrderExample example);

    List<B2cOrder> selectByExample(B2cOrderExample example);

    B2cOrderWithBLOBs selectByPrimaryKey(Long orderId);

    int updateByExampleSelective(@Param("record") B2cOrderWithBLOBs record, @Param("example") B2cOrderExample example);

    int updateByExampleWithBLOBs(@Param("record") B2cOrderWithBLOBs record, @Param("example") B2cOrderExample example);

    int updateByExample(@Param("record") B2cOrder record, @Param("example") B2cOrderExample example);

    int updateByPrimaryKeySelective(B2cOrderWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(B2cOrderWithBLOBs record);

    int updateByPrimaryKey(B2cOrder record);
}