package com.zhuxiang.creational.factorymethod;

import com.zhuxiang.creational.factorymethod.operation.AbstractOperation;

/**
 * @Description
 * @Author:zhuxiang
 * @Date:2018/7/7 20:56
 */
public abstract class OperationFactory {
    /**
     * 定义方法 创建具体工厂
     *
     * @return
     */
    abstract AbstractOperation createOperation();
}
