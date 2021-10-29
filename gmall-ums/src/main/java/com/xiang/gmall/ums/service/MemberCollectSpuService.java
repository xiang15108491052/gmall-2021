package com.xiang.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiang.gmall.ums.entity.MemberCollectSpuEntity;
import com.xiang.core.bean.PageVo;
import com.xiang.core.bean.QueryCondition;


/**
 * 会员收藏的商品
 *
 * @author xcj
 * @email xiangchuanjiang624@qq.com
 * @date 2021-10-29 10:44:16
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpuEntity> {

    PageVo queryPage(QueryCondition params);
}

