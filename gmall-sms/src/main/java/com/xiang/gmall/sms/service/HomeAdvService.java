package com.xiang.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiang.gmall.sms.entity.HomeAdvEntity;
import com.xiang.core.bean.PageVo;
import com.xiang.core.bean.QueryCondition;


/**
 * 首页轮播广告
 *
 * @author xcj
 * @email xiangchuanjiang624@qq.com
 * @date 2021-10-29 10:42:54
 */
public interface HomeAdvService extends IService<HomeAdvEntity> {

    PageVo queryPage(QueryCondition params);
}

