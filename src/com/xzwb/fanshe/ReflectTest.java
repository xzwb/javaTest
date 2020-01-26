package com.xzwb.fanshe;

import com.xzwb.info.User;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * 使用反射创建对象
 */
public class ReflectTest {
    public static void main(String[] args) {
        try {
            Class c = Class.forName("com.xzwb.info.User");
            // 调用无参构造器
            User u = (User) c.newInstance();
            // 调用有参构造器
            Constructor<User> constructor = c.getDeclaredConstructor(int.class, String.class);
            User user = constructor.newInstance(101, "yyf");
            System.out.println(user);
            // 通过反射API调用普通方法
            Method method = c.getDeclaredMethod("setName", String.class);
            method.invoke(user, "xzwb");
            System.out.println(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
