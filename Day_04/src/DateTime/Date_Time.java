package DateTime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_Time {
    public static void main(String[] args) throws ParseException {
//        demo01();
//        demo02();
        demo03();
    }

    private static void demo03() throws ParseException {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = df.parse("2020-04-18 17:58:28");
        System.out.println(date);
    }

    private static void demo02() {
        DateFormat fo = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = new Date();
        String time = fo.format(d);
        System.out.println(time);
    }

    private static void demo01() {
//        Date date = new Date();
//        long time = date.getTime();
        Date currentDate = new Date(/*new Date().getTime()*/);
        System.out.println(currentDate);
//        System.out.println(time);
//        System.out.println(System.currentTimeMillis());
//        Date currentDate = new Date(/*new Date().getTime()*/System.currentTimeMillis());
//        System.out.println(currentDate);
    }
}
