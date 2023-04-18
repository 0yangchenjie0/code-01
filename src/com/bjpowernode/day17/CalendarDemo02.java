package com.bjpowernode.day17;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * - Calendar.YEAR 获取年份
 * - Calendar.MONTH 获取月份，**0表示1月，1表示2月，...，11表示12月**
 * - Calendar.DAY_OF_MONTH  获取本月的第几天
 * - Calendar.DAY_OF_YEAR  获取本年的第几天
 * - Calendar.HOUR_OF_DAY  小时，24小时制
 * - Calendar.HOUR  小时，12小时制
 * - Calendar.MINUTE  获取分钟
 * - Calendar.SECOND  获取秒
 * - Calendar.MILLISECOND  获取毫秒
 * - Calendar.DAY_OF_WEEK  获取星期几，**1表示星期日，2表示星期一，...，7表示星期六**
 */
public class CalendarDemo02 {
    public static void main(String[] args) {
        // 使用静态方法创建日历类的对象，获取到的是当前日期的一个日历类对象
        Calendar calendar = Calendar.getInstance(); // 多态 GregorianCalendar

        System.out.println(calendar.get(Calendar.YEAR)); //2023
        // 将年份设置成2022年
        calendar.set(Calendar.YEAR,2022);
        System.out.println(calendar.get(Calendar.YEAR)); //2022

        // 设置年月日时分秒
        calendar.set(2000,9,10,10,10,10);

        // 获取日期对象的格式化字符串
        String dateSrt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(calendar.getTime());
        System.out.println(dateSrt);// 2000-10-10 10:10:10

    }
}
