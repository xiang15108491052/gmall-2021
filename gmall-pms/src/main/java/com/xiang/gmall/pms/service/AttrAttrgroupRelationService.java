package com.xiang.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiang.gmall.pms.entity.AttrAttrgroupRelationEntity;
import com.xiang.core.bean.PageVo;
import com.xiang.core.bean.QueryCondition;


/**
 * 属性&属性分组关联
 *
 * @author xcj
 * @email xiangchuanjiang624@qq.com
 * @date 2021-10-29 10:39:04
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageVo queryPage(QueryCondition params);
}

