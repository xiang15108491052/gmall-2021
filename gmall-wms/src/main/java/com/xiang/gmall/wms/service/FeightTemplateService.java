package com.xiang.gmall.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiang.gmall.wms.entity.FeightTemplateEntity;
import com.xiang.core.bean.PageVo;
import com.xiang.core.bean.QueryCondition;


/**
 * 运费模板
 *
 * @author xcj
 * @email xiangchuanjiang624@qq.com
 * @date 2021-10-28 14:50:41
 */
public interface FeightTemplateService extends IService<FeightTemplateEntity> {

    PageVo queryPage(QueryCondition params);
}

