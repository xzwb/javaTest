import java.util.ArrayList;
import java.util.List;

/*
public class GenericTest2 {
    public static void test(List<Object> c) {
        for (int i = 0; i < c.size(); i++) {
            System.out.println(c.get(i));
        }
    }

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        // String是Object的子类但是List<String>不是List<Object>的子类
        // test(stringList);
    }
}
*/

public class GenericTest2 {
    public static void test(List<?> c) {
        for (int i = 0; i < c.size(); i++) {
            System.out.println(c.get(i));
        }
    }

    public static void main(String[] args) {
        // 一般不适用类型通配符定义变量只会将他放在形参位置
        List<?> c = new ArrayList<String>();
        // 不能向C中添加对象
        // c.add("happy");

    }
}