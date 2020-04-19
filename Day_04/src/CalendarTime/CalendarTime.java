package CalendarTime;

import java.util.Calendar;

public class CalendarTime {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(2008, 8, 8);
        c.add(Calendar.YEAR, 10);
        c.add(Calendar.MONTH, -1);
        int year = c.get(Calendar.YEAR);
        System.out.println(year);
        int month = c.get(Calendar.MONTH);
        System.out.println(month);//西方的月份，以0开始
        int Date = c.get(Calendar.DATE);
        System.out.println(Date);


    }

}
