package com.bjpowernode.day16;

/**
 * 字符串和基本数据类型转换
 */
public class WrapperClass03 {

    public static void main(String[] args) {
        // 字符串转基本数据类型
        int i1 = Integer.parseInt("100"); // string--> int
        double d1 = Double.parseDouble("10.2");
        boolean b1 = Boolean.parseBoolean("true");

        // 不能将字符串转换成 char

        // 基本数据类型转换成字符串
        String s1 = 100 + "";
        String s2 = Integer.toString(100);
        String s3 = Boolean.toString(true);  // true --->"true"
        String s4 = Character.toString('a'); // 'a' ---> "a"
        System.out.println(s1 + s2); //100100
        System.out.println(s3); // 字符串true
    }
}
