package com.xiang.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiang.gmall.sms.entity.SeckillSessionEntity;
import com.xiang.core.bean.PageVo;
import com.xiang.core.bean.QueryCondition;


/**
 * 秒杀活动场次
 *
 * @author xcj
 * @email xiangchuanjiang624@qq.com
 * @date 2021-10-29 10:42:54
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageVo queryPage(QueryCondition params);
}

