package com.bjpowernode.day16;

public class StringBuilderDemo01 {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer();
        // synchronized 线程安全 效率较低
        buffer.append("");

        // 线程不安全 效率更高
        StringBuilder builder = new StringBuilder();

        builder.append("").append("aaa").reverse().append("aa");
    }
}
