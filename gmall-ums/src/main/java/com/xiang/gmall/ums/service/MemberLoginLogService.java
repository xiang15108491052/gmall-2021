package com.xiang.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiang.gmall.ums.entity.MemberLoginLogEntity;
import com.xiang.core.bean.PageVo;
import com.xiang.core.bean.QueryCondition;


/**
 * 会员登录记录
 *
 * @author xcj
 * @email xiangchuanjiang624@qq.com
 * @date 2021-10-29 10:44:16
 */
public interface MemberLoginLogService extends IService<MemberLoginLogEntity> {

    PageVo queryPage(QueryCondition params);
}

