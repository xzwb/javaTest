public class LambdaTest1 {
    public static void main(String[] args) {
        Converter conver = string -> "hello world".indexOf(string);
        Integer value = conver.converter("ll");
        System.out.println(value);
        // 下面用Lambda表达式引用特定对象的实例方法
        // 特定对象::实例方法
        // 这里的实例方法可以不是类方法
        Converter converter2 = "hello world"::indexOf;
        // 特定对象是hello world实例方法是indexof
        Integer value1 = converter2.converter("ll");
        System.out.println(value1);
    }
}
