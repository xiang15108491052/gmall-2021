package com.xiang.gmall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiang.gmall.oms.entity.OrderSettingEntity;
import com.xiang.core.bean.PageVo;
import com.xiang.core.bean.QueryCondition;


/**
 * 订单配置信息
 *
 * @author xcj
 * @email xiangchuanjiang624@qq.com
 * @date 2021-10-28 15:12:24
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageVo queryPage(QueryCondition params);
}

