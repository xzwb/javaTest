public class LambdaTest {
    public static void main(String[] args) {
        LambdaDome lambdaDome = () -> "xzwb";
        System.out.println(lambdaDome.test());
        ((LambdaDome1)(()-> System.out.println("hahahha"))).test1();
    }
}

// 一般Lambda表达式用于函数式接口
// 就是只有一个方法的接口
@FunctionalInterface
interface LambdaDome {
    public String test();
}

@FunctionalInterface
interface LambdaDome1 {
    public void test1();
}

