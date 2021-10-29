package com.xiang.gmall.oms.dao;

import com.xiang.gmall.oms.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author xcj
 * @email xiangchuanjiang624@qq.com
 * @date 2021-10-28 15:12:24
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
