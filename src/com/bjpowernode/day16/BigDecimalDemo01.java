package com.bjpowernode.day16;

import java.math.BigDecimal;

public class BigDecimalDemo01 {
    public static void main(String[] args) {
        System.out.println(0.09 + 0.01); // 0.09999999999999999
        System.out.println(1.0 - 0.32);  // 0.6799999999999999
        System.out.println(1.015 * 100); //101.49999999999999
        System.out.println(1.301 / 100); // 0.013009999999999999

        System.out.println("---------------------");

        BigDecimal b1 = new BigDecimal("-10.20");
        System.out.println(b1);
        BigDecimal b2 = b1.abs();
        System.out.println(b2);
    }
}
