package com.bjpowernode.day08;

/**
 * 数组的默认初始化
 *             数组是引用类型，只要数组一经分配空间，那么数组中的每个元素都会被隐式的设置一个默认值。
 *             以下是针对不同数据类型的默认值：
 *             1、整数类型（byte、short、int、long）的默认值为 0。
 *             2、浮点型（float、double）的默认值为 0.0。
 *             3、字符型（char）的默认为  '\u0000'。
 *             4、布尔类型的默认值为 false。
 *             5、引用类型的默认值为 null  (null就是空对象)。
 */

public class ArrayDemo04 {
    public static void main(String[] args) {
        int[] arr1 = new int[3];
        arr1[2] = 200;
        System.out.println(arr1[0]); //0
        System.out.println(arr1[1]); //0
        System.out.println(arr1[2]); //0

        System.out.println("-------------------");
        double[] arr2 = new double[2];
        arr2[0] = 10.34;
        System.out.println(arr2[0]); //10.34
        System.out.println(arr2[1]); //0.0

        System.out.println("-------------------");
        boolean[] arr3 = new boolean[2];
        arr3[0] = true;
        System.out.println(arr3[0]);// true
        System.out.println(arr3[1]);// false

        System.out.println("-------------------");
        char[] arr4 = new char[2];
        arr4[0] = 'c';
        System.out.println(arr4[0]);
        System.out.println(arr4[1]);

        System.out.println("-------------------");
        // 引用类型的默认值为 null  (null就是空对象)。
        String[] arr5 = new String[2];
        arr5[0] = "hello";
        System.out.println(arr5[0]); // hello
        System.out.println(arr5[1]); // null


        System.out.println("-------------------");
        // 空指针异常，访问了一个不存在的引用数据类型
        int[] arr6 = null; // 在内存是没有开辟空间的
        //System.out.println(arr6.length); // 访问了空对象的length 会抛出异常 NullPointerException

        arr6[0] = 100; // NullPointerException
        System.out.println(arr6[0]); // NullPointerException

    }
}
