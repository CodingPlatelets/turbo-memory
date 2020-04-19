package DateTime;


import java.math.BigInteger;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


/*
 * 计算一个人已经出生了多少年*/
public class ExerciseForDate {


    public static void main(String[] args) throws ParseException {
        //long形无法计算60 * 60 * 24 * 365 * 1000，所以使用BigIntgeter来存储大数
        final long year =  60 * 60 * 24 * 365;
        BigInteger yr = BigInteger.valueOf(year);
        BigInteger toSec = new BigInteger("1000");
        //格式为yyyy-MM-dd HH:mm:ss的输入: 2001-01-08
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入出生日期。格式：yyyy-MM-dd");
        String input = sc.nextLine();
        //创建dateFormat对象 格式为yyyy-MM-dd HH:mm:ss
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        //将字符串格式化为date对象
        Date in = df.parse(input);
        //创建当前时间
        Date currentTime = new Date();
        //算出时间差
        long ages = currentTime.getTime() - in.getTime();
        //输出时间除以(1000*60*60*24)
//        long age = ages / year;
//        age = age / 1000;
//        System.out.println((age));
        BigInteger ag = BigInteger.valueOf(ages);
        System.out.println(ag.divide(yr.multiply(toSec)).toString());//toString()的括号中可以写转换出来的进制
    }
}
