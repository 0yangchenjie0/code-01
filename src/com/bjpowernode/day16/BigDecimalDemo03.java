package com.bjpowernode.day16;

import java.math.BigDecimal;

/**
 * BigDecimal类型转化为基本数据类型
 * 注意精度的问题
 */

public class BigDecimalDemo03 {
    public static void main(String[] args) {

        BigDecimal b1 = new BigDecimal("1000");
        BigDecimal b2 = new BigDecimal("100000");
        System.out.println(b1 == b2); // false
        System.out.println(b1.equals(b2)); // true

        // 0  相等
        // 1  b1 > b2
        // -1 b1 < b2
        System.out.println(b1.compareTo(b2));
//        BigDecimal b1 = new BigDecimal("10.3");
//        float f1 = b1.floatValue();
//        double f2 = b1.doubleValue();
//        int i1 = b1.intValue();
//        System.out.println(f1); // 10.3
//        System.out.println(f2); // 10.3
//        System.out.println(i1); // 10
    }
}
