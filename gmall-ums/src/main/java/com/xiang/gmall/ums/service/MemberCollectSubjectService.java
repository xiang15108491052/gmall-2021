package com.xiang.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiang.gmall.ums.entity.MemberCollectSubjectEntity;
import com.xiang.core.bean.PageVo;
import com.xiang.core.bean.QueryCondition;


/**
 * 会员收藏的专题活动
 *
 * @author xcj
 * @email xiangchuanjiang624@qq.com
 * @date 2021-10-29 10:44:16
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubjectEntity> {

    PageVo queryPage(QueryCondition params);
}

