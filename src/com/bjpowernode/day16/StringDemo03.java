package com.bjpowernode.day16;

/**
 * 判断类方法
 */
public class StringDemo03 {
    public static void main(String[] args) {
        String str = "AbcdEfg";
        // 是否为空
        System.out.println(str.isEmpty()); //fasle
        // 是否字符串的内容是否相同
        System.out.println(str.equals("AbcdEfg")); // true
        System.out.println(str.equals("abcdefg")); // false

        // 忽略大小写比较是否相同
        System.out.println(str.equalsIgnoreCase("abcdefg")); // true

        // 是否包含 判断一个字符串是否是另一个的子串
        System.out.println(str.contains("fg")); // true
        System.out.println(str.contains("cg")); // false
        System.out.println(str.contains("abc"));// false

        // 判断是否以某个字符串开头
        System.out.println(str.startsWith("Abc")); // true
        System.out.println(str.startsWith("A")); // true
        System.out.println(str.startsWith("bc")); // false

        // 判断是否以某个字符串结尾
        System.out.println(str.endsWith("fg")); // true
        System.out.println(str.endsWith("g")); // true
        System.out.println(str.endsWith("G")); // false
    }
}
