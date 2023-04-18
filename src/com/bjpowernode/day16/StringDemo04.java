package com.bjpowernode.day16;

/**
 * 字符串遍历和截取
 */
public class StringDemo04 {
    public static void main(String[] args) {
        String str = "0123456789";
        // 获取字符串的长度，返回字符串中字符的个数
        System.out.println(str.length());

        System.out.println("abcdef".charAt(0));
        System.out.println("abcdef".charAt(1));
        System.out.println("abcdef".charAt(2));
        System.out.println("abcdef".charAt(3));
        System.out.println("abcdef".charAt(4));
        System.out.println("abcdef".charAt(5));
        // System.out.println("abcdef".charAt(6)); // StringIndexOutOfBoundsException

        System.out.println("---------------");
        // 遍历出字符串中的所有字符
        for (int i = 0; i < str.length(); i++) {
            // 通过下标获取字符串中的字符的内容，返回的数据类型是 char
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println("\n-------------------");
        // 字符串接截取, 从指定索引开始到到字符串最后，返回一个新的字符串
        System.out.println("0123456789".substring(5)); // 56789

        // 从指定索引开始(包含)到到指定索引（不包含）的字符串
        System.out.println("0123456789".substring(5, 7)); // 56

        System.out.println(str.substring(5, str.length())); // 56789
    }
}
