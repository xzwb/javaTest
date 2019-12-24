import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("xzwb");
        c.add("yyf");
        c.add("czfb");
        c.add("haha");
        Iterator it = c.iterator();
        /*while (it.hasNext()) {
            // 这里next()方法返回费时object类型
            String name = (String)it.next();
            System.out.println(name);
            // 删除元素
            if (name.equals("czfb")) {
                it.remove();
            }
            // 对name复制不会改变集合内元素
            name = "yi";
        }
        System.out.println(c);*/
        // 在迭代过程中不能删除集合中的元素
        /*if (it.hasNext()) {
            c.remove("yyf");
        }*/
        while (it.hasNext()) {
            // c.remove("yyf");
            // 删除不是集合中的元素时可以
            // c.remove("shgjad");
            // 删除倒数第二个可以
            if (((String)it.next()).equals("czfb")) {
                c.remove("czfb");
            }
        }
        System.out.println(c);
    }
}
