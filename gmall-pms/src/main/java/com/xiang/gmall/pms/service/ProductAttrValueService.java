package com.xiang.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiang.gmall.pms.entity.ProductAttrValueEntity;
import com.xiang.core.bean.PageVo;
import com.xiang.core.bean.QueryCondition;


/**
 * spu属性值
 *
 * @author xcj
 * @email xiangchuanjiang624@qq.com
 * @date 2021-10-29 10:39:04
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageVo queryPage(QueryCondition params);
}

