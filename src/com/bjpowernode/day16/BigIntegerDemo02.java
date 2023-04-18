package com.bjpowernode.day16;

import java.math.BigInteger;

public class BigIntegerDemo02 {
    public static void main(String[] args) {
        // 建议使用字符串构造
        // System.out.println(Long.MAX_VALUE); // 9223372036854775807
        //long a = 9223372036854775808L;

        // BigInteger b1 = new BigInteger("9223372036854775808");
        BigInteger b1 = new BigInteger("100");
        // 注意数据要能落在可以转换的范围内
        long b2 = b1.longValue();
        System.out.println(b2);
        System.out.println(b1.intValue());
    }
}
