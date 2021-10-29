package com.xiang.gmall.pms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiang.core.bean.PageVo;
import com.xiang.core.bean.Query;
import com.xiang.core.bean.QueryCondition;

import com.xiang.gmall.pms.dao.SpuImagesDao;
import com.xiang.gmall.pms.entity.SpuImagesEntity;
import com.xiang.gmall.pms.service.SpuImagesService;


@Service("spuImagesService")
public class SpuImagesServiceImpl extends ServiceImpl<SpuImagesDao, SpuImagesEntity> implements SpuImagesService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<SpuImagesEntity> page = this.page(
                new Query<SpuImagesEntity>().getPage(params),
                new QueryWrapper<SpuImagesEntity>()
        );

        return new PageVo(page);
    }

}