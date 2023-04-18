package com.bjpowernode.day02;
/**
    常量的内容不可以更改
    在java语言中，使用 final 关键字声明常量
    final 数据类型 常量名称 = 常量的值;
    常量的名称都使用大写，如果是多个单词，使用下划线分割 
    eg: PI、MAX_VALUE
    // 声明常量并赋值
    final double PI = 3.1415926;
*/
public class ConstantDemo {
	public static void main(String[] args) {
		// 声明一个常量
		final double PI;
		// 给常量赋值
		PI = 3.1415926;
		// 尝试改变常量的值
		// PI = 3.14; // 常量一旦赋初值，常量的内容将不能再更改
		System.out.println(PI);
		
		System.out.println("------------------------------");
		// 声明常量的同时赋值
		final int MAX_VALUE = 65535;
		// MAX_VALUE = 100; // 错误: 无法为最终变量MAX_VALUE分配值
		System.out.println(MAX_VALUE);
	}
}