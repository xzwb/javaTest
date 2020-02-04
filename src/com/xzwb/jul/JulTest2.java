package com.xzwb.jul;

import java.util.logging.Logger;

/**
 * logger对象的父子关系
 */
public class JulTest2 {
    public static void main(String[] args) {
        Logger logger1 = Logger.getLogger("com.xzwb.jul");
        Logger logger2 = Logger.getLogger("com.xzwb");

        // 测试
        System.out.println(logger1.getParent() == logger2);
        System.out.println(logger2.getParent() + "");
        System.out.println(logger2.getParent().getParent() + "");
    }
}
