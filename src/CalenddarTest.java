import java.util.Calendar;

public class CalenddarTest {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        for (int year = 1999; year < 10000; year+=100) {
            calendar.set(calendar.YEAR, year);
            // 月份是从0开始的
            calendar.set(calendar.MONTH, 11);
            calendar.set(calendar.DAY_OF_MONTH, 31);
            /*System.out.println(year + " " + calendar.get(Calendar.DAY_OF_WEEK));*/
            // 1表示星期天，外国人的一周是从星期天开始的
            if (calendar.get(Calendar.DAY_OF_WEEK) == 1) {
                System.out.println(year);
                break;
            }
        }
    }
}
