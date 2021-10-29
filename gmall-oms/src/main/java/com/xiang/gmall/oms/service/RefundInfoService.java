package com.xiang.gmall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiang.gmall.oms.entity.RefundInfoEntity;
import com.xiang.core.bean.PageVo;
import com.xiang.core.bean.QueryCondition;


/**
 * 退款信息
 *
 * @author xcj
 * @email xiangchuanjiang624@qq.com
 * @date 2021-10-28 15:12:24
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageVo queryPage(QueryCondition params);
}

