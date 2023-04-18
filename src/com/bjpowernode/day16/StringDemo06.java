package com.bjpowernode.day16;

public class StringDemo06 {
    public static void main(String[] args) {
        String str = "中国";

        // 将字符转换成字节数组
        byte[] bytes = str.getBytes();

        byte[] bytes1 = new byte[bytes.length];

        for (int i = 0; i < bytes.length; i++) {
            bytes1[i] = bytes[i];
        }
        System.out.println(new String(bytes));

        System.out.println("----------------");
        // 将字符串转换成字符数组
        char[] chars = str.toCharArray();
        for (char c : chars) {
            System.out.println(c);
        }

        // 去空格 ,只去掉两边的空格
        System.out.println(" aa bb ".trim());
        // 转小写
        System.out.println("abAB".toLowerCase()); //abab
        // 转大写
        System.out.println("abAB".toUpperCase()); //ABAB
    }
}
