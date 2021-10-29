package com.xiang.gmall.oms.dao;

import com.xiang.gmall.oms.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author xcj
 * @email xiangchuanjiang624@qq.com
 * @date 2021-10-28 15:12:24
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
