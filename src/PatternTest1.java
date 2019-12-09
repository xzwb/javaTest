import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternTest1 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("a*b");
        Matcher matcher = pattern.matcher("vbcabaacvbaaabdasdasdfafqaaaab");
        System.out.println(matcher.matches());
        // 如果该正则表达式只需使用一次
        Boolean b = Pattern.matches("a*b", "aaaaaab");
        System.out.println(b);
        // 看字符串里面有没有匹配的子串
        /*System.out.println(matcher.find());
        System.out.println(matcher.find());
        System.out.println(matcher.group());
        System.out.println(matcher.start());
        System.out.println(matcher.end());
        */
        // 遍历字符串中所有匹配的子串
        /*while (matcher.find()) {
            System.out.println(matcher.group());
        }*/
        // 带int参数的find方法
    }
}
