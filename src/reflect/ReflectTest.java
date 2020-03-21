package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectTest {
    public static void main(String[] args) {
        try {
            ServiceImpl service = (ServiceImpl) Class.forName("reflect.ServiceImpl").getConstructor(int.class, String.class).newInstance(1, "yyf");
//            Method method = service.getClass().getMethod("sayHello", int.class, String.class);
//            method.invoke(service, service.getId(), service.getName());
            service.sayHello(1, "yyf");
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
