package com.zhuxiang.creational.factorymethod;

import com.zhuxiang.creational.factorymethod.operation.AbstractOperation;
import com.zhuxiang.creational.factorymethod.operation.OperationAdd;
import com.zhuxiang.creational.factorymethod.operation.OperationSub;

/**
 * @Description
 * @Author:zhuxiang
 * @Date:2018/7/7 21:01
 */
public class OperationSubFactory extends OperationFactory {
    /**
     * 定义方法 创建具体工厂
     *
     * @return
     */
    @Override
    AbstractOperation createOperation() {
        return new OperationSub();
    }
}
