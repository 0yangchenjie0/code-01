package com.bjpowernode.day04;

/**
语法格式：条件表达式 ? 表达式1 ： 表达式2;

如果条件表达式为 true，则取表达式1 的值，否则就取表达式2 的值。
*/
public class OperatorDemo06 {

	public static void main(String[] args) {
		int m = 100;
		int n = 200;
		// 获取两个数的最大值
		int max = m > n ? m : n;
		System.out.println(max);
		
		// 求三个数的最大值
		int n1 = 20;
		int n2 = 35;
		int n3 = 10;
	
		// 先计算n1 和 n2 的最大值，赋值给max1
		int max1 = n1 > n2 ? n1 : n2;
		// 再计算 max1 和 n3的最大值，赋值给max2
		int max2 = max1 > n3 ? max1 : n3;
		System.out.println(max2);
	}
}




