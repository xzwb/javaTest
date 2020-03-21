package dongtaidaili;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkExample implements InvocationHandler {
    // 真实对象
    private Object object = null;

    /**
     * 建立代理对象和真实对象的代理关系并返回代理对象
     * @return
     */
    public Object bind(Object object) {
        this.object = object;
        return Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        System.out.println("进入代理方法");
        System.out.println("在调度真实对象前的服务");
        Object object = method.invoke(this.object, objects);
        System.out.println("调用之后的服务");
        return object;
    }
}

class Test {
    public static void main(String[] args) {
        JdkExample jdkExample = new JdkExample();
        HelloWorld helloWorld = (HelloWorld) jdkExample.bind(new HelloWorldImpl());
        helloWorld.say();
    }
}