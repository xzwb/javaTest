public class AnonymousInnerClassTest1 {
    public static void test(AnonymousDome1 dome) {
        System.out.println("name is " + dome.getName() + "price is " + dome.getPrice());
    }

    public static void main(String[] args) {
        // 第一种只用一次这个匿名内部类
        test(new AnonymousDome1("xzwb") {
            @Override
            public int getPrice() {
                return 10000;
            }
        });

        // 第二种创建一个AnonymousDoem1的对象
        AnonymousDome1 anonymousDome1 = new AnonymousDome1("xzwb") {
            @Override
            public int getPrice() {
                return 56465;
            }
            // 重写父类方法
            public String getName() {
                return "yyf";
            }
        };
        test(anonymousDome1);
    }
}

// 匿名内部类所要继承的应该是抽象类或者接口
abstract class AnonymousDome1 {
    private String name;
    // 带有构造器
    public AnonymousDome1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    // 带有一到两个抽象方法
    public abstract int getPrice();
}