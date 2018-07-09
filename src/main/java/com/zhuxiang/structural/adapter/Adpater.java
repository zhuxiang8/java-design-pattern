package com.zhuxiang.structural.adapter;

/**
 * @Description 适配器类
 * @Author:zhuxiang
 * @Date:2018/7/9 18:20
 */
public class Adpater extends Target {
    /**
     * 使用对象适配器模式
     */
    private Adpatee adpatee = new Adpatee();

    /**
     * 规范方法
     */
    @Override
    void getRequest() {
        adpatee.specificRequest();
    }
}
