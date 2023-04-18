package com.bjpowernode.day16;

/**
 * 基本数据类型转换成包装类
 */
public class WrapperClass01 {

    public static void main(String[] args) {
        // 该数组可以存储所有 Object子类的对象
        // Object[] arr = {"a", 1, 2, 1.9, true, 'a'};

        // 创建一个包装类的对象
        Integer i1 = new Integer(100);
        // Integer i2 = new Integer("200a"); // NumberFormatException
        Integer i2 = new Integer("200");

        Float f1 = new Float(10.2);
        Float f2 = new Float("10.2");

        System.out.println(i1.toString()); //100
        System.out.println(i2.toString()); //200
        System.out.println(f1);
        System.out.println(f2);

        // 将基本数据类型转换成包装类
        Integer a1 = Integer.valueOf(100);
        Double d1 = Double.valueOf("10.2");

        // 针对 Character 类型，字符串不能转化为 Character 类型的包装对象
        Character c1 = new Character('a');
        Character c2 = Character.valueOf('c');

        // 针对Boolean类型，只有字符串为“true”(不区分大小写)的时候，转化为包装对象的值才为true，否则都为 false。

        Boolean b1 = Boolean.valueOf(true); // true
        Boolean b2 = Boolean.valueOf(false);// // true
        Boolean b3 = Boolean.valueOf("true"); // true
        Boolean b4 = Boolean.valueOf("fasle"); // false
        Boolean b5 = Boolean.valueOf("abc"); // false
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);


    }
}
