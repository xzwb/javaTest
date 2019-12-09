// 贪婪模式和勉强模式

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternTest3 {
    public static void main(String[] args) {
        String str = "hhheeelllooowor45678ld";
        // 贪婪模式下匹配一个
        /*System.out.println(str.replaceFirst("h?", "123"));*/
        // 勉强模式下匹配0个
        System.out.println(str.replaceFirst("h??", "123"));
        // 占有模式比贪婪模式还狠 以下为贪婪模式和占有模式的对比
        // 占有模式不会替换，因为根本找不到
        /*正则：\w+[a-z]与\w++[a-z]
        目标串：232hjdhfd7474$
        分析：①\w+[a-z]：\w+属于贪婪模式，会一次性吃掉它所能吃掉的所有的字符，也就是子串232hjdhfd7474，此时[a-z]不能够找到匹配了，故\w+匹配的串会吐出一个字符4，但此时还是得不到匹配。反复的这样吐出回退，直到吐出字符d时，此时[a-z]能够匹配h，所以这时正则表达式会返回一次成功的匹配结果，为232hjdhfd
             ②\w++[a-z]：\w++属于侵占模式，它会一次性吃掉它所能够吃掉的所有字符，即子串232hjdhfd7474，而且不留给其他部分使用，故不会回退。此时[a-z]不能够找到匹配，所以此次匹配失败。在余下的子串中也找不到能匹配成功的子串。所以整个正则表达式是找不到匹配结果的！
        */
        System.out.println(str.replaceFirst("\\w++[1-9]", "123"));
        // 贪婪模式
        System.out.println(str.replaceFirst("\\w+[1-9]", "123"));

        // {}运算符的贪婪模式和勉强模式
        // 在{}里面没有其他限制条件的情况下贪婪模式和勉强模式是没有区别的
        System.out.println(str.replaceFirst("h{1,}", "123"));
        System.out.println(str.replaceFirst("h{1,}?", "123"));
    }
}
