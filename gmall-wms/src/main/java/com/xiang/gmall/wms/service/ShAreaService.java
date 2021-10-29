package com.xiang.gmall.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiang.gmall.wms.entity.ShAreaEntity;
import com.xiang.core.bean.PageVo;
import com.xiang.core.bean.QueryCondition;


/**
 * 全国省市区信息
 *
 * @author xcj
 * @email xiangchuanjiang624@qq.com
 * @date 2021-10-28 14:50:41
 */
public interface ShAreaService extends IService<ShAreaEntity> {

    PageVo queryPage(QueryCondition params);
}

