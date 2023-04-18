package com.bjpowernode.day16;

/**
 * 自动装箱和拆箱
 */
public class WrapperClass04 {

    public static void main(String[] args) {
        // 自动装箱
        Integer i1 = 100;

        Integer i3 = null;
        // int i4 = i3.intValue();
        int i4 = i3; // java.lang.NullPointerException

        // Integer i1 = Integer.valueOf(100);
        System.out.println(i1);

        // 存放基本数据类型的数组（自动装箱）
        Object[] arr = {11.1, 18, 12, 11.1};

        // 自动拆箱
        int i2 = Integer.valueOf(100);
        // int i2 = Integer.valueOf(100).intValue();
        System.out.println(i2);
    }
}
