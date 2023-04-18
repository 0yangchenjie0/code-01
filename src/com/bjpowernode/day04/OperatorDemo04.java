package com.bjpowernode.day04;

/**
 比较运算符,计算结果都是 boolean 类型
 ==
 !=
 >
 <
 >=
 <=
*/
public class OperatorDemo04 {

	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		System.out.println(i == 10); // true
		System.out.println(i == j);  // false
		System.out.println(i > j);   // false
		System.out.println(i < j);   // true
		System.out.println("---------------------------");
		
		int m = 100;
		int n = 100;
		System.out.println(m >= n); // true
		System.out.println(m <= n); // true
	}
}




