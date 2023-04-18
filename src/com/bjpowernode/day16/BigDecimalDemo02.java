package com.bjpowernode.day16;

import java.math.BigDecimal;

public class BigDecimalDemo02 {
    public static void main(String[] args) {
//        System.out.println(0.09 + 0.01); // 0.09999999999999999
//        System.out.println(1.0 - 0.32);  // 0.6799999999999999
//        System.out.println(1.015 * 100); //101.49999999999999
//        System.out.println(1.301 / 100); // 0.013009999999999999

        BigDecimal b1 = new BigDecimal("0.09");
        BigDecimal b2 = new BigDecimal("0.01");
        BigDecimal r1 = b1.add(b2);
        System.out.println(r1); // 0.10

        System.out.println(b1.subtract(b2));//0.08
        System.out.println(b1.multiply(b2));//0.0009
        System.out.println(b1.divide(b2));// 0.0009

        // System.out.println(new BigDecimal("10.0").divide(new BigDecimal("3.0"))); // ArithmeticException


        // 四舍五入
        System.out.println(new BigDecimal("3.266").setScale(2, BigDecimal.ROUND_HALF_DOWN)); // 3.27
        System.out.println(new BigDecimal("3.264").setScale(2, BigDecimal.ROUND_HALF_DOWN)); // 3.26

        // 除法的四舍五入
        BigDecimal a1 = new BigDecimal("10.0");
        BigDecimal a2 = new BigDecimal("3.0");
        BigDecimal a3 = a1.divide(a2, 4, BigDecimal.ROUND_HALF_DOWN);
        System.out.println(a3);// 3.33

    }
}
