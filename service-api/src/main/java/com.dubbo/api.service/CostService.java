package com.dubbo.api.service;

/**
 * @Author LiuYang
 * @Date 2019/6/14/014  15:56
 * @Version 1.0
 **/

/**
 * dubbo Service API 定义
 */
public interface CostService {
    /**
     * 成本增加
     * @param cost
     * @return
     */
    Integer add(int cost);
}
