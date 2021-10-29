package com.xiang.gmall.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiang.gmall.wms.entity.WareInfoEntity;
import com.xiang.core.bean.PageVo;
import com.xiang.core.bean.QueryCondition;


/**
 * 仓库信息
 *
 * @author xcj
 * @email xiangchuanjiang624@qq.com
 * @date 2021-10-28 14:50:41
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageVo queryPage(QueryCondition params);
}

