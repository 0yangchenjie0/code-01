package com.bjpowernode.day01;

import java.util.Random;

/**
 * 我的第一个java程序
 * @author jack
 * @version 1.0
*/
public class HelloWorld02 {

    /**
     * 应用程序的入口方法
     * @param args 方法参数
    */
	public static void main(String[] args) {
		// 在控制台打印输出 Hello World
		System.out.println("Hello World");

		Random random = new Random();
		
		/*
		  多行注释
		  打印一个三角形
		*/
		System.out.println("*");
		System.out.println("* *");
		System.out.println("* * *");
		System.out.println("* * * *");
	}
}