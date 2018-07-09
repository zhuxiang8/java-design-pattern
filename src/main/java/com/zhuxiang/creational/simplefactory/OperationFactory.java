package com.zhuxiang.creational.simplefactory;

import com.zhuxiang.creational.simplefactory.operation.*;

/**
 * @Description 静态工厂类
 * @Author:zhuxiang
 * @Date:2018/7/7 15:29
 */
public class OperationFactory {
    /**
     * 根据传入的符号参数，实例化所需要的子类
     *
     * @param operation
     * @return
     */
    public static AbstractOperation createOperation(String operation) {
        switch (operation) {
            case "+":
                return new OperationAdd();
            case "-":
                return new OperationSub();
            case "*":
                return new OperationMul();
            case "/":
                return new OperationDiv();
            default:
                break;
        }
        return null;
    }
}
