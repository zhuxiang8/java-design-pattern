package com.zhuxiang.creational.factorymethod;


import com.zhuxiang.creational.factorymethod.operation.AbstractOperation;

/**
 * @Description
 * @Author:zhuxiang
 * @Date:2018/7/7 15:41
 */
public class MainTest {
    /**
     * 执行函数
     *
     * @param args
     */
    public static void main(String[] args) {
        OperationFactory factory = new OperationAddFactory();
        AbstractOperation operation1 = factory.createOperation();
        operation1.setNumbA(10);
        operation1.setNumbB(20);
        double result1 = operation1.getResult();

        OperationFactory factory1 = new OperationSubFactory();
        AbstractOperation operation2 = factory1.createOperation();
        operation2.setNumbA(10);
        operation2.setNumbB(20);
        double result2 = operation2.getResult();

        System.out.println("结果1=" + result1);
        System.out.println("结果2=" + result2);
    }
}
