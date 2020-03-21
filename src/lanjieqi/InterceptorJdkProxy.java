package lanjieqi;

import dongtaidaili.HelloWorld;
import dongtaidaili.HelloWorldImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class InterceptorJdkProxy implements InvocationHandler {
    private Object target; // 真实对象
    private String interceptorClass = null; // 拦截器全限定类名

    public InterceptorJdkProxy(Object target, String interceptorClass) {
        this.target = target;
        this.interceptorClass = interceptorClass;
    }

    public static Object bind(Object target, String interceptorClass) {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InterceptorJdkProxy(target, interceptorClass));
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        if (interceptorClass == null) {
            return method.invoke(target, objects);
        }
        Object result = null;
        Interceptor interceptor = (Interceptor) Class.forName(interceptorClass).getConstructor().newInstance();
        if (interceptor.before(o, target, method, objects)) {
            result = method.invoke(target, objects);
        } else {
            interceptor.around(o, target, method, objects);
        }
        interceptor.after(o, target, method, objects);
        return result;
    }
}

class Test {
    public static void main(String[] args) {
//        HelloWorld proxy = (HelloWorld) InterceptorJdkProxy.bind(new HelloWorldImpl(), "lanjieqi.InterceptorImpl");
        HelloWorld proxy = (HelloWorld) InterceptorJdkProxy.bind(new HelloWorldImpl(), null);
        proxy.say();
    }
}