package com.zhuxiang.structural.proxy;

/**
 * @Description 真实主题类
 * @Author:zhuxiang
 * @Date:2018/7/9 23:26
 */
public class RealSubject extends Subject {
    /**
     * 定义真实类和代理类的公共接口
     */
    @Override
    void request() {
        System.out.println("真实主题类接口");
    }
}
