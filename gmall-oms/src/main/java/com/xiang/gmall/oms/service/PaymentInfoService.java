package com.xiang.gmall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiang.gmall.oms.entity.PaymentInfoEntity;
import com.xiang.core.bean.PageVo;
import com.xiang.core.bean.QueryCondition;


/**
 * 支付信息表
 *
 * @author xcj
 * @email xiangchuanjiang624@qq.com
 * @date 2021-10-28 15:12:24
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageVo queryPage(QueryCondition params);
}

