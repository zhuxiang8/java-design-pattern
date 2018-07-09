package com.zhuxiang.structural.adapter;


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
        Target target = new Adpater();
        target.getRequest();
    }
}
