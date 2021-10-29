package com.xiang.gmall.ums.dao;

import com.xiang.gmall.ums.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author xcj
 * @email xiangchuanjiang624@qq.com
 * @date 2021-10-29 10:44:16
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
