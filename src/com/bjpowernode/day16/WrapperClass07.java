package com.bjpowernode.day16;

/**
 * 进制转换
 */
public class WrapperClass07 {

    public static void main(String[] args) {
        Integer i1 = 100;
        Integer i2 = 100;
        // i1 和 i2 指向同一个地址
        System.out.println(i1 == i2); // true

        // 自动拆箱
        System.out.println(i1 == 100);// true

        Integer i3 = 5000;
        Integer i4 = 5000;

        System.out.println(i3 == i4); // false
        // 自动拆箱
        System.out.println(i3 == 5000); // true
    }
}
