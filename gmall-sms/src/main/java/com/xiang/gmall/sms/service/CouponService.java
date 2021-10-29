package com.xiang.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiang.gmall.sms.entity.CouponEntity;
import com.xiang.core.bean.PageVo;
import com.xiang.core.bean.QueryCondition;


/**
 * 优惠券信息
 *
 * @author xcj
 * @email xiangchuanjiang624@qq.com
 * @date 2021-10-29 10:42:54
 */
public interface CouponService extends IService<CouponEntity> {

    PageVo queryPage(QueryCondition params);
}

