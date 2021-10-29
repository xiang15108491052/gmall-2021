package com.xiang.gmall.sms.dao;

import com.xiang.gmall.sms.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author xcj
 * @email xiangchuanjiang624@qq.com
 * @date 2021-10-29 10:42:54
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
