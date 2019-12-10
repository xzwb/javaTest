public class LambdaTest2 {
    public static void main(String[] args) {
        MyTest myTest = (a, b, c) -> a.substring(b, c);
        String str = myTest.test("hahahahahahah", 1, 5);
        System.out.println(str);
        // 下面用另一种lambda表达式
        // 引用某类对象的实例方法，就是第一个参数作为对象，后面的参数作为方法的参数
        MyTest myTest1 = String::substring;
        String str1 = myTest1.test("hahahahahahahahah", 1, 5);
        System.out.println(str1);
    }
}

@FunctionalInterface
interface MyTest {
    String test(String a, int b, int c);
}
