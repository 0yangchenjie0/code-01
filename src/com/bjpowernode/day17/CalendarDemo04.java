package com.bjpowernode.day17;

import java.util.Calendar;
import java.util.Date;

/**
 * 日历对象和日期对象之间的转换
 *
 * Date date = getTime()
 * void setTime(new Date)
 */
public class CalendarDemo04 {
    public static void main(String[] args) {

        Calendar calendar1 = Calendar.getInstance();
        // 将日历类转换成日期类
        Date date = calendar1.getTime();
        System.out.println(date); // Mon Apr 17 10:52:51 CST 2023

        // 将日期类转换成日历类
        Date now = new Date();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(now);
    }
}
