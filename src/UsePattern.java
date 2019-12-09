import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 会爬到该网页中的所有链接 大部分网页无法爬是因为网页源代码太长放不下 后续可改进为先放到文件中然后一次取一点匹配

public class UsePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要爬的网页");
        String str = scanner.next();
        WebPage webPage = new WebPage();
        webPage.setPageUrl(str);
        String webSource = webPage.getPageSource();
        Pattern pattern = Pattern.compile("href=\"\\S+\"");
        Matcher matcher = pattern.matcher(webSource);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}

class WebPage {
    private String pageUrl;
    private String pageEncode = "UTF8";

    public String getPageUrl() {
        return pageUrl;
    }

    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    public String getPageSource() {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            URL url = new URL(pageUrl);
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream(), pageEncode));
            String line;
            while ((line = in.readLine()) != null) {
                stringBuilder.append(line);
            }
            in.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }
}