package com.bjpowernode.day04;

/**
1.算术运算符
- i++, i-- 先使用变量 i 原有值参与运算操作，运算操作完成后，变量 i的值自增1或者自减1；
- ++i, --i先将变量`i`的值自增1或者自减1，然后使用更新后的新值参与运算操作。
*/

public class OperatorDemo02 {

	public static void main(String[] args) {
	
		int i = 100;
		int m = i++; // i++ 或 i--，先运算，再自增或自减
		
		int j = 100;
		int n = ++j; // ++j 或 --j，先自增或自减，再参与运算
		
		System.out.println(i); // 101
		System.out.println(j); // 101
		System.out.println(m); // 100
		System.out.println(n); // 101
		
		// 请问代码执行后 num 的值为多少？
		int num = 5; 
		num = num++; 
		System.out.println(num); // 5
		
		// 可以对常量进行递增或递减操作吗？例如：5++ 或 ++5。不可以
		
		System.out.println("---------------------------");
		int a = 3, b = 4; 
		System.out.println(a++ / 3 + --b * 2 - a-- % 6 + b++ * 3 - ++b); // 7
		System.out.println(a); //3
		System.out.println(b); //5
	}

}




