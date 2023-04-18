package com.bjpowernode.day16;

/**
 *
 */
public class StringDemo05 {
    public static void main(String[] args) {
        String str1 = "abcdeffff";
        // 字符在字符串第一次出现的位置(索引)
        System.out.println(str1.indexOf('f')); // 5
        // 字符在字符串最后一次出现的位置(索引)
        System.out.println(str1.lastIndexOf('f')); // 8

        System.out.println("-----------------");
        String str2 = "aabbccbbcc";
        // 字符串在字符串第一次出现的位置(索引) 返回参数字符串第一个字符的索引
        System.out.println(str2.indexOf("bb")); //2
        // 字符串在字符串最后一次出现的位置(索引) 返回参数字符串第一个字符的索引
        System.out.println(str2.lastIndexOf("bb"));//6


        // 获取第一个 W 到最后一个 S 中间的内容 包括 W 和 S
        String str3 = "Hello World Hello Spring Hibernate Status";
        int beginIndex = str3.indexOf('W');
        int endIndex = str3.lastIndexOf('S') + 1;
        System.out.println(str3.substring(beginIndex,endIndex)); // World Hello Spring Hibernate S
    }
}
