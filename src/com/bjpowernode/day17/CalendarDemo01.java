package com.bjpowernode.day17;

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
public class CalendarDemo01 {
    public static void main(String[] args) {
        // 使用静态方法创建日历类的对象，获取到的是当前日期的一个日历类对象
        Calendar calendar = Calendar.getInstance(); // 多态 GregorianCalendar
        // System.out.println(calendar);

        // 取值
        System.out.println(calendar.get(Calendar.YEAR));  // 年份 2023
        System.out.println(calendar.get(Calendar.MONTH)); // 月份 3  月份是 0 - 11,0 代表1月
        System.out.println(calendar.get(Calendar.DATE)); //  日期 17
        System.out.println(calendar.get(Calendar.HOUR)); //  12小时制 下午6点
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY)); //24小时制 18
        System.out.println(calendar.get(Calendar.MINUTE)); // 分钟 32
        System.out.println(calendar.get(Calendar.SECOND)); // 秒
        System.out.println(calendar.get(Calendar.MILLISECOND)); // 毫秒

        System.out.println("------------------------------");

        System.out.println(calendar.get(Calendar.DAY_OF_MONTH)); // 本月的第几天  17
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));  // 本年的第几天  107
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));  // 本周的第几天  2 周日是一周的第一天
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH)); // 本月的第几周 3 ？？？？


    }
}
