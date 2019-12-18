import java.util.ArrayList;
import java.util.List;

public class GenericTest {
    public static void main(String[] args) {
        // 创建一个保存字符串的List集合
        List<String> stringList = new ArrayList<>();
        // 这个时候就不能放一个整形进去了
        // stringList.add(5);
        stringList.add("hello");
        stringList.forEach(str -> System.out.println(str.length()));
        // 如果不声明泛型
        List str = new ArrayList();
        // str.add(5);
        str.add("hello");
        // 可以放任何对象进去 但是用的时候必须强制类型转化
        str.forEach(str1 -> System.out.println(((String)str1).length()));
    }
}
