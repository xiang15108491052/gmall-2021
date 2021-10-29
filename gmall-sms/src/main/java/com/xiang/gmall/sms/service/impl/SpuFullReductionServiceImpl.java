package com.xiang.gmall.sms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiang.core.bean.PageVo;
import com.xiang.core.bean.Query;
import com.xiang.core.bean.QueryCondition;

import com.xiang.gmall.sms.dao.SpuFullReductionDao;
import com.xiang.gmall.sms.entity.SpuFullReductionEntity;
import com.xiang.gmall.sms.service.SpuFullReductionService;


@Service("spuFullReductionService")
public class SpuFullReductionServiceImpl extends ServiceImpl<SpuFullReductionDao, SpuFullReductionEntity> implements SpuFullReductionService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<SpuFullReductionEntity> page = this.page(
                new Query<SpuFullReductionEntity>().getPage(params),
                new QueryWrapper<SpuFullReductionEntity>()
        );

        return new PageVo(page);
    }

}