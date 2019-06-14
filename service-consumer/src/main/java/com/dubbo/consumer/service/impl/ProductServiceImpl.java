package com.dubbo.consumer.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.api.service.CostService;
import com.dubbo.consumer.service.ProductService;

/**
 * @Author LiuYang
 * @Date 2019/6/14/014  16:11
 * @Version 1.0
 **/
@Service
public class ProductServiceImpl implements ProductService {
    /**
            * 使用dubbo的注解 com.alibaba.dubbo.config.annotation.Reference。进行远程调用service
     */
    @Reference
    private CostService costService;

    @Override
    public Integer getCost(int a) {
        return costService.add(a);
    }
}
