package com.zhuxiang.structural.proxy;

/**
 * @Description 代理类
 * @Author:zhuxiang
 * @Date:2018/7/9 23:27
 */
public class Proxy extends Subject {
    /**
     * 定义真实类
     */
    private RealSubject realSubject;

    /**
     * 定义真实类和代理类的公共接口
     */
    @Override
    void request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        realSubject.request();
    }
}
