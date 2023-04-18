package com.bjpowernode.day14;

/**
 * 所有类都直接或间接继承 Object
 */
public class ObjectDemo01 extends Object {

    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();

        System.out.println(obj1.getClass().getName());
        System.out.println(obj2.getClass().getName());
        // 对象的类型+@+哈希码
        // 由于 toString 方法返回的结果是内存地址，而在开发中，经常需要按照对象的属性得到相应的字符串表现形式，因此也需要重写它。
        System.out.println(obj1.toString()); // java.lang.Object@1b6d3586
        System.out.println(obj2.toString()); // java.lang.Object@4554617c

        // System.out.println 默认会调用对象的 toString()
        System.out.println(obj1); // java.lang.Object@1b6d3586
        System.out.println(obj2); // java.lang.Object@1b6d3586

        System.out.println("--------------------------");

        int[] arr = {1,2};
        System.out.println(arr.toString()); //[I@74a14482
    }
}
