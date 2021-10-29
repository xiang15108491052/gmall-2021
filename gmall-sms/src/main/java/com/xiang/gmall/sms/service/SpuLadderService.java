package com.xiang.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiang.gmall.sms.entity.SpuLadderEntity;
import com.xiang.core.bean.PageVo;
import com.xiang.core.bean.QueryCondition;


/**
 * 商品阶梯价格
 *
 * @author xcj
 * @email xiangchuanjiang624@qq.com
 * @date 2021-10-29 10:42:54
 */
public interface SpuLadderService extends IService<SpuLadderEntity> {

    PageVo queryPage(QueryCondition params);
}

