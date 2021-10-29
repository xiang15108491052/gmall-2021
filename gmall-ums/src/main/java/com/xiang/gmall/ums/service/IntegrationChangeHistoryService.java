package com.xiang.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiang.gmall.ums.entity.IntegrationChangeHistoryEntity;
import com.xiang.core.bean.PageVo;
import com.xiang.core.bean.QueryCondition;


/**
 * 积分变化历史记录
 *
 * @author xcj
 * @email xiangchuanjiang624@qq.com
 * @date 2021-10-29 10:44:16
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageVo queryPage(QueryCondition params);
}

