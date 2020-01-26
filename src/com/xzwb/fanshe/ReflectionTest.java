package com.xzwb.fanshe;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 反射学习
 */
public class ReflectionTest {
    public static void main(String[] args) {
        try {
            Class c = Class.forName("com.xzwb.info.User");
            // 获得全路径
            System.out.println(c.getName());
            // 获得相对路径
            System.out.println(c.getSimpleName());
            // 获取属性
            Field[] fields = c.getFields();
            // 只能返回为public的属性
            System.out.println(fields.length);
            // 要获得所有的属性
            Field[] fields1 = c.getDeclaredFields();
            System.out.println(fields1.length);
            for (Field f : fields1) {
                System.out.println(f);
            }
            // 获得所有方法
            Method[] methods = c.getDeclaredMethods();
            for (Method m : methods) {
                System.out.println(m);
            }
            // 获得构造器
            Constructor[] constructors = c.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                System.out.println(constructor);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
