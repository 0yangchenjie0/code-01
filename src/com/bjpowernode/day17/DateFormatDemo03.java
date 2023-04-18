package com.bjpowernode.day17;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 比较两个日期的大小
 */
public class DateFormatDemo03 {
    public static void main(String[] args) throws ParseException {
        //1.创建一个日期格式化类的对象
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        //2.创建两个日期字符串
        String str1 = "2022-10-11 09:10:00";
        String str2 = "2023-11-11 09:10:00";

        //3.将日期字符串转换成日期对象
        Date d1 = format.parse(str1);
        Date d2 = format.parse(str2);

        //4.比较两个日期的大小
        System.out.println(d1.after(d2)); // false
    }
}
