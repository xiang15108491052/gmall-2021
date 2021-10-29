package com.xiang.gmall.pms.dao;

import com.xiang.gmall.pms.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author xcj
 * @email xiangchuanjiang624@qq.com
 * @date 2021-10-29 10:39:04
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
