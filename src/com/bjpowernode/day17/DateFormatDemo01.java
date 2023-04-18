package com.bjpowernode.day17;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * yyyy 四位年
 * MM   二位月
 * dd   二位日
 * HH   二位小时
 * mm   二位的分钟
 * ss   二位的秒
 * S    毫秒
 *
 * - D  获得当前时间是今年的第几天
 * - w  获得当前时间是今年的第几周
 * - W 获得当前时间是本月的第几周
 */
public class DateFormatDemo01 {
    public static void main(String[] args) throws ParseException {

        // SimpleDateFormat format = new SimpleDateFormat();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
        // 将日期对象转换成日期字符串
        String dateSrt = format.format(new Date());
        System.out.println(dateSrt); // 2023-04-17 09:53:43

        String dataStr1 = "2022-10-10 10:10:10";
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // 将日期字符串转换成日期对象
        Date date = format1.parse(dataStr1);
        System.out.println(date); //Mon Oct 10 10:10:10 CST 2022
    }
}
