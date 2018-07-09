package com.zhuxiang.creational.factorymethod.operation;

/**
 * @Description 乘法计算类
 * @Author:zhuxiang
 * @Date:2018/7/7 15:34
 */
public class OperationDiv extends AbstractOperation {
    /**
     * 体现java多态性
     * 定义统一的方法
     *
     * @return
     */
    @Override
    public double getResult() {
        return this.getNumbA() / this.getNumbB();
    }
}
