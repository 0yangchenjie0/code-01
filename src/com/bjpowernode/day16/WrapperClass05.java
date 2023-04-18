package com.bjpowernode.day16;

/**
 * 自动装箱和拆箱的缓存问题
 */
public class WrapperClass05 {

    public static void main(String[] args) {
        Integer i1 = 1000;
        Integer i2 = 1000;
        // 在内存中创建了两个 Integer 类型的对象，两个对象的地址不同
        System.out.println(i1 == i2); // false

        // 比较的是包装类的内容是否相同
        System.out.println(i1.equals(i2)); // true

        Integer i3 = 127;
        Integer i4 = 127;
        // -128 ~127 之间的值会进行缓存处理
        System.out.println(i3 == i4); // true
        System.out.println(i3.equals(i4)); // true
    }
}
