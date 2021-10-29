package com.xiang.gmall.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiang.gmall.wms.entity.WareOrderTaskDetailEntity;
import com.xiang.core.bean.PageVo;
import com.xiang.core.bean.QueryCondition;


/**
 * 库存工作单
 *
 * @author xcj
 * @email xiangchuanjiang624@qq.com
 * @date 2021-10-28 14:50:41
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageVo queryPage(QueryCondition params);
}

