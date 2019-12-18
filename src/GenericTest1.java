import java.util.ArrayList;
import java.util.Collection;

public class GenericTest1<T> {
    // 泛型中不允许出现一下情况
    // static T info;
    // 不能在任何静态的东西里面出现T
    // static void bar(T msg) { }
    public static void main(String[] args) {
        Collection<String> cs = new ArrayList<>();
        // 不能用instanceof运算符判断是不是该类对象
        // instanceof运算符后不能跟泛型
        // if (cs instanceof ArrayList<String>) { }
    }
}
