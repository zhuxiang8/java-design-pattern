package com.zhuxiang.creational.simplefactory.operation;

import lombok.Data;

/**
 * @Description 抽象产品基类
 * @Author:zhuxiang
 * @Date:2018/7/7 15:30
 */
@Data
public abstract class AbstractOperation {
    /**
     * 定义需要执行计算的参数A
     */
    private double numbA;

    /**
     * 定义需要执行计算的参数A
     */
    private double numbB;

    /**
     * 体现java多态性
     * 定义统一的方法
     *
     * @return
     */
    public abstract double getResult();
}
