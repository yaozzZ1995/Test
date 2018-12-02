package com.itheima.day02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 将日期转换成指定字符串
 * Date: 2018/12/1
 * Time: 19:10
 */
public class Test02 {
    public static void main(String[] args) throws ParseException {

       /* System.out.println(DateToString(new Date()));
        System.out.println(StringToDate("1995/03/19"));*/
       String birthday = "1995/3/19";
       getBirthday(birthday);
    }

    private static void getBirthday(String birthday) throws ParseException {
        Date after = StringToDate(birthday);
        long l = after.getTime();
        long a = new Date().getTime();
        double v = (a-l) / 1000.0 / 3600 / 24;
        System.out.println(v);
    }

    private static Date StringToDate(String s) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        Date date = format.parse(s);
        return date;
    }

    public static String DateToString(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = dateFormat.format(date);
        return format;
    }
}
