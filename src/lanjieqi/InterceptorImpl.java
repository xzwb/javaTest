package lanjieqi;

import java.lang.reflect.Method;

public class InterceptorImpl implements Interceptor {
    @Override
    public boolean before(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("反射前");
        return false;
    }

    @Override
    public void around(Object proxy, Object target, Method method, Object[] args) {
        System.out.println(".....");
    }

    @Override
    public void after(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("end");
    }
}
