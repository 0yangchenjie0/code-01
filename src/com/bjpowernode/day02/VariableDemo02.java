package com.bjpowernode.day02;

/**
变量的特点：在于"变"字，声明变量所开辟的内存空间可以多次赋值。
1.在方法中声明的变量，必须赋值之后才能使用。
2.先声明后赋值，没用声明的变量名什么都不是。
3.赋值的数据类型必须和声明变量的数据类型一致。
4.在同一个方法中，不能声明多个同名的变量(变量不能重复定义)。
*/
public class VariableDemo02 {
	public static void main(String[] args) {
	   // 先声明后赋值，没用声明的变量名什么都不是
	   // System.out.println(age); 错误

	   // 声明变量 在方法中声明的变量，必须赋值之后才能使用
	   int age;
	   // 给变量赋值
	   age = 18;
	   System.out.println(age);

	   // 声明变量的同时赋值
	   int studentAge = 20; //int

	   // 声明变量所开辟的内存空间可以多次赋值。
	   studentAge = 30; // int

	   // 赋值的数据类型必须和声明变量的数据类型一致
	   // studentAge = 30.5; // double 错误: 不兼容的类型: 从double转换到int可能会有损失

	   // 在同一个方法中，不能声明多个同名的变量(变量不能重复定义)
	   // int studentAge = 50; //  错误: 已在方法 main(String[])中定义了变量 studentAge

	   System.out.println(studentAge);
	}
}