package com.xiang.gmall.oms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiang.core.bean.PageVo;
import com.xiang.core.bean.Query;
import com.xiang.core.bean.QueryCondition;

import com.xiang.gmall.oms.dao.OrderItemDao;
import com.xiang.gmall.oms.entity.OrderItemEntity;
import com.xiang.gmall.oms.service.OrderItemService;


@Service("orderItemService")
public class OrderItemServiceImpl extends ServiceImpl<OrderItemDao, OrderItemEntity> implements OrderItemService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<OrderItemEntity> page = this.page(
                new Query<OrderItemEntity>().getPage(params),
                new QueryWrapper<OrderItemEntity>()
        );

        return new PageVo(page);
    }

}