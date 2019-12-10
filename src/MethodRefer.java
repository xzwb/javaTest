public class MethodRefer {
    public static void main(String[] args) {
        Converter converter1 = string -> Integer.valueOf(string);
        Integer value = converter1.converter("99");
        System.out.println(value);
        // 下面使用更简洁的Lambda表达式
        // 采用 类名：：类方法的形式
        // 这种形式一般用于方法只有一条语句要传入的参数就是传入方法的参数
        Converter converter2 = Integer::valueOf;
        // 结尾不需要括号只需要类方法名称
        Integer value1 = converter2.converter("55");
        System.out.println(value1);
    }
}

interface Converter {
    Integer converter(String string);
}