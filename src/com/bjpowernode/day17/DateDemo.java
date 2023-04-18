package com.bjpowernode.day17;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        // 1970 1  1 0 0 0 到现在的毫秒数
        System.out.println(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis()); // 1681693799309  Mon Apr 17 09:09:59 CST 2023

        // 获取当前时间的日期对象
        Date d1 = new Date();
        System.out.println(d1.toString()); // Mon Apr 17 09:07:34 CST 2023  Mon Apr 17 09:09:22 CST 2023

        // 通过一个时间戳创建一个日期对象
        Date d2 = new Date(1681693799309L);
        System.out.println(d2); // Mon Apr 17 09:09:59 CST 2023

        // 从日期对象获取时间戳
        System.out.println(d2.getTime()); // 1681693799309

        // 改变日期对象存储的时间
        d2.setTime(0);
        System.out.println(d2); // Thu Jan 01 08:00:00 CST 1970

        // 比较两个时间是否相等
        System.out.println(d1.equals(d2)); // false
        System.out.println(d1.before(d2)); // false
        System.out.println(d2.before(d1)); // true
        System.out.println(d1.after(d2)); // true
        System.out.println(new Date(0).equals(new Date(0))); // false


       // System.out.println(new Date().getYear());
    }
}
