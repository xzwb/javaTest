import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternTest2 {
    public static void main(String[] args) {
        // 匹配以12结尾的字符串
        // 去掉^ $答案会不一样
        /*Pattern pattern = Pattern.compile("^(sd)*$");
        Matcher matcher = pattern.matcher("asdsdsdsdsdsdb");
        System.out.println(matcher.matches());
        System.out.println(matcher.find());*/

        // []运算符
        /*Pattern pattern = Pattern.compile("12[1-9]");
        Matcher matcher = pattern.matcher("125");
        System.out.println(matcher.matches());*/

        // +运算符 出现一次或多次
        /*Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher("123456888");
        System.out.println(matcher.matches());*/

        // ?运算符 只能是出现一次或零次
        /*Pattern pattern = Pattern.compile("(12)?");
        Matcher matcher = pattern.matcher("");
        System.out.println(matcher.matches());*/

        // {}运算符
        Pattern pattern = Pattern.compile("n{0}");
        Matcher matcher = pattern.matcher("");
        System.out.println(matcher.matches());
    }
}
