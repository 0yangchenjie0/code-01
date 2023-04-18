package com.bjpowernode.day16;

public class StringDemo08 {
    public static void main(String[] args) {

        String str1 = "HelloWorld";
        String str2 = "Hello" + "World";
        /**
         * 直接字符串常量拼接，对于编译期就能确定的值，编译器会将值合并
         * String str2 = "Hello" + "World";
         * 我们反编译字节码文件，就会将看到 : String str2 = "HelloWorld";
         * 所以 str1 == str2 输出true
         */
        System.out.println(str1 == str2); // true


        final String s1 = "hello";
        String s2 = s1 + "world"; // 加 final 等价于  String s2 = "hello" + "world";
        String s3 = "helloworld";
        System.out.println(s2.equals(s3)); // true
        System.out.println(s2 == s3); //true

        System.out.println("---------------------");

        String str = "hello";
        String hw = str + "world";
        String helloWolrd = "helloworld";
        System.out.println(hw == helloWolrd); // false

    }
}
