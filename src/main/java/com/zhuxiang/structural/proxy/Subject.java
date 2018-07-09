package com.zhuxiang.structural.proxy;

/**
 * @Description 抽象主题类
 * @Author:zhuxiang
 * @Date:2018/7/9 23:22
 */
public abstract class Subject {
    /**
     * 定义真实类和代理类的公共接口
     */
    abstract void request();
}
