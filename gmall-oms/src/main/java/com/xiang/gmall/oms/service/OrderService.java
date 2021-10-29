package com.xiang.gmall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiang.gmall.oms.entity.OrderEntity;
import com.xiang.core.bean.PageVo;
import com.xiang.core.bean.QueryCondition;


/**
 * 订单
 *
 * @author xcj
 * @email xiangchuanjiang624@qq.com
 * @date 2021-10-28 15:12:24
 */
public interface OrderService extends IService<OrderEntity> {

    PageVo queryPage(QueryCondition params);
}

