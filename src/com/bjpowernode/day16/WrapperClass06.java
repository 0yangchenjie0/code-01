package com.bjpowernode.day16;

/**
 * 进制转换
 */
public class WrapperClass06 {

    public static void main(String[] args) {
        //10 - 2
        System.out.println(Integer.toBinaryString(10)); // 1010
        //10 - 16
        System.out.println(Integer.toHexString(10));// a
        //10 - 8
        System.out.println(Integer.toOctalString(8)); //10

        System.out.println("----------------------");

        System.out.println(Integer.parseInt("0",10));
        System.out.println(Integer.parseInt("FFFF",16)); //255


    }
}
