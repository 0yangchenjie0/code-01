package com.bjpowernode.day17;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 获得当前时间是今年的第几天
 */
public class DateFormatDemo02 {
    public static void main(String[] args) {
        //1.创建一个日期格式化类的对象
        SimpleDateFormat format = new SimpleDateFormat("D");
        System.out.println(format.format(new Date())); // 107
    }
}
