package com.xiang.gmall.oms.controller;

import java.util.Arrays;
import java.util.Map;


import com.xiang.core.bean.PageVo;
import com.xiang.core.bean.QueryCondition;
import com.xiang.core.bean.Resp;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.xiang.gmall.oms.entity.OrderReturnApplyEntity;
import com.xiang.gmall.oms.service.OrderReturnApplyService;




/**
 * 订单退货申请
 *
 * @author xcj
 * @email xiangchuanjiang624@qq.com
 * @date 2021-10-28 15:12:24
 */
@Api(tags = "订单退货申请 管理")
@RestController
@RequestMapping("oms/orderreturnapply")
public class OrderReturnApplyController {
    @Autowired
    private OrderReturnApplyService orderReturnApplyService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('oms:orderreturnapply:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = orderReturnApplyService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('oms:orderreturnapply:info')")
    public Resp<OrderReturnApplyEntity> info(@PathVariable("id") Long id){
		OrderReturnApplyEntity orderReturnApply = orderReturnApplyService.getById(id);

        return Resp.ok(orderReturnApply);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('oms:orderreturnapply:save')")
    public Resp<Object> save(@RequestBody OrderReturnApplyEntity orderReturnApply){
		orderReturnApplyService.save(orderReturnApply);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('oms:orderreturnapply:update')")
    public Resp<Object> update(@RequestBody OrderReturnApplyEntity orderReturnApply){
		orderReturnApplyService.updateById(orderReturnApply);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('oms:orderreturnapply:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		orderReturnApplyService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
