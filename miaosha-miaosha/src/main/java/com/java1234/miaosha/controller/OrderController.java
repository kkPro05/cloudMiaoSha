package com.java1234.miaosha.controller;

import com.java1234.miaosha.entity.Order;
import com.java1234.miaosha.entity.R;
import com.java1234.miaosha.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 秒杀商品控制器
 * @author zk
 * @company Java知识分享网
 * @create 2021-01-30 15:28
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private IOrderService orderService;

    /**
     * 根据id查询秒杀商品详情
     * @param id
     * @return
     */
    @RequestMapping("/detail")
    public R detail(String id){
        Order order = orderService.findById(id);
        Map<String,Object> map=new HashMap<>();
        map.put("data",order);
        return R.ok(map);
    }
}
