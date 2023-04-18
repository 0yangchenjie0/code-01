package com.bjpowernode.day16;

public class StringBufferDemo01 {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer("Hello");
        System.out.println(sb1.length());
        System.out.println(sb2.length());
        System.out.println("--------------------");

        StringBuffer buffer = new StringBuffer();
        buffer.append("Hello");
        buffer.append("World").append("aaaa");
        // HelloWorldaaaa
        buffer.insert(2,"***"); // He***lloWorldaaaa
        buffer.deleteCharAt(7); // He***llWorldaaaa
        System.out.println(buffer);

        System.out.println("-------------");

        StringBuffer buffer1 = new StringBuffer("0123456789");
        // 包括开始索引，不包括结束的索引
        buffer1.delete(3,8);
        System.out.println(buffer1);//012 89


        StringBuffer buffer2 = new StringBuffer("0123456789");
        // 包括开始索引，不包括结束的索引
        buffer2.replace(3,8,"*******");
        System.out.println(buffer2);//012*******89

        StringBuffer buffer3 = new StringBuffer("ABCDEFG");
        buffer3.reverse();
        System.out.println(buffer3); // GFEDCBA
    }
}
