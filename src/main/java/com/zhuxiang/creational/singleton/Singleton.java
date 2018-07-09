package com.zhuxiang.creational.singleton;

/**
 * @Description 饿汉模式 单例模式
 * @Author:zhuxiang
 * @Date:2018/7/7 21:38
 */
public class Singleton {
    /**
     * 先在内存中创建对象
     */
    private static final Singleton singleton = new Singleton();

    /**
     * 返回已存在的对象
     *
     * @return
     */
    public static synchronized Singleton getInstance() {
        return singleton;
    }
}
