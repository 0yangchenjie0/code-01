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
public class CalendarDemo03 {
    public static void main(String[] args) {
        // 使用静态方法创建日历类的对象，获取到的是当前日期的一个日历类对象
        Calendar calendar = Calendar.getInstance(); // 多态 GregorianCalendar

        // 设置年月日时分秒
        calendar.set(2001,1,28,10,10,10);

        // 向后移动1天
        calendar.add(Calendar.DATE,1);
        // 向后推移5个小时
        calendar.add(Calendar.HOUR_OF_DAY,5);

        // 获取日期对象的格式化字符串
        String dateSrt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(calendar.getTime());
        System.out.println(dateSrt);// 2001-03-01 15:10:10
    }
}

// 2000-01-30 10:10:10
// 2000-02-04 10:10:10

// 2000-02-28 10:10:10
// 2000-02-29 10:10:10

// 2001-02-28 10:10:10
// 2001-03-01 10:10:10

// 2001-02-28 10:10:10
// 2001-03-01 15:10:10

// 2001-02-28 10:10:10
// 2001-02-27 05:10:10