package com.xiang.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiang.gmall.pms.entity.SkuImagesEntity;
import com.xiang.core.bean.PageVo;
import com.xiang.core.bean.QueryCondition;


/**
 * sku图片
 *
 * @author xcj
 * @email xiangchuanjiang624@qq.com
 * @date 2021-10-29 10:39:04
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageVo queryPage(QueryCondition params);
}

