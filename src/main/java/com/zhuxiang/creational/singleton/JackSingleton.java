package com.zhuxiang.creational.singleton;

/**
 * @Description 懒汉模式 单例模式
 * @Author:zhuxiang
 * @Date:2018/7/7 21:41
 */
public class JackSingleton {
    private static JackSingleton jackSingleton = null;

    /**
     * 需要判断对象有没有创建
     *
     * @return
     */
    public static synchronized JackSingleton getInstance() {
        if (jackSingleton == null) {
            jackSingleton = new JackSingleton();
        }
        return jackSingleton;
    }
}
