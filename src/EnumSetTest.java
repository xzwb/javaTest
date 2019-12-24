import java.util.EnumSet;

public class EnumSetTest {
    public static void main(String[] args) {
        // 创建一个EnumSet集合, 集合元素就是EnumSetDome枚举类的全部枚举值
        EnumSet es = EnumSet.allOf(EnumSetDemo.class);
        System.out.println(es);
    }
}

enum EnumSetDemo {
    SPRING, SUMMER, FALL, WINTER
}
