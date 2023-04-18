package com.bjpowernode.day16;

/**
 * 替换类
 * 不影响原来的字符串，每次操作都产生新的字符串
 */
public class StringDemo07 {
    public static void main(String[] args) {
        String str = "HelloWorld";
        String str1 = str.replace('o','@');
        System.out.println(str); // HelloWorld
        System.out.println(str1);// Hell@W@rld

        String str2 = str.replace("l","**");
        System.out.println(str2); // He****oWor**d
    }
}
