public class LambdaTest3 {
    public static void main(String[] args) {
        YourTest yourTest = string -> new Test1(string);
        Test1 test1 = yourTest.create("xzwb");
        System.out.println(test1.string);
        // 下面用lambda表达式引用构造器
        YourTest yourTest1 = Test1::new;
        Test1 test2 = yourTest1.create("yyf");
        System.out.println(test2.string);
    }
}

interface YourTest {
    public Test1 create(String string);
}

class Test1 {
    public String string;

    public Test1(String string) {
        this.string = string;
    }
}
