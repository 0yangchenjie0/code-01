package com.bjpowernode.day14;

/**
 * 如何判断两个对象是否相等
 */
public class ObjectDemo03 {

    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj1 == obj2); // false // 比较两个对象的地址是否相同
        // 等价
        System.out.println(obj1.equals(obj2));// false

    }

}


