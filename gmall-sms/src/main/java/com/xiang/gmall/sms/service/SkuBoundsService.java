package com.xiang.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiang.gmall.sms.entity.SkuBoundsEntity;
import com.xiang.core.bean.PageVo;
import com.xiang.core.bean.QueryCondition;


/**
 * 商品sku积分设置
 *
 * @author xcj
 * @email xiangchuanjiang624@qq.com
 * @date 2021-10-29 10:42:54
 */
public interface SkuBoundsService extends IService<SkuBoundsEntity> {

    PageVo queryPage(QueryCondition params);
}

