package com.bjpowernode.day16;

import java.math.BigInteger;

public class BigIntegerDemo01 {
    public static void main(String[] args) {
        // 建议使用字符串构造
        System.out.println(Long.MAX_VALUE);
        //long a = 9223372036854775808L;

        BigInteger b = new BigInteger("9223372036854775808");
        System.out.println(b);

        BigInteger b1 = new BigInteger("10");
        BigInteger b2 = new BigInteger("3");

        // 每次执行完运算都会产生一个新的 BigInteger 对象
        BigInteger r1 = b1.add(b2);
        System.out.println(r1); // 13
        System.out.println(b1.subtract(b2));//7
        System.out.println(b1.multiply(b2));//30
        System.out.println(b1.divide(b2)); // 3

        // 取模
        BigInteger[] r2 = b1.divideAndRemainder(b2);
        System.out.println("商：" + r2[0] + "，余数：" + r2[1]); // 商：3，余数：1


    }
}
