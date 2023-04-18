package com.bjpowernode.day03;
/**
1. 定义两个变量，
   int i;
   double j;
   打印输出两个变量 + - * / 后的结果
2. 判断一下内容的计算结果
   10/3
   10.0/3
3. 交换两个变量的值
	int i = 100;
	int j = 200;
	交换两个变量的内容
4. 扩展：
   定义一个年龄 int age = 18;
   1.如果定义的年龄 >=18 控制台输出：已成年
   2.如果定义的年龄 <18  控制台输出：未成年
*/
public class DataType07 {

	public static void main(String[] args) {
		int i = 10;
		double j = 20.0;
		System.out.println(i + j); // 30.0
		System.out.println(i - j); // -10.0
		System.out.println(i * j); // 200.0
		System.out.println(i / j); // 0.5
		System.out.println("--------------------");
		System.out.println(10/3); // 3
		System.out.println(10.0/3); //3.3333333333333335
		
		
		System.out.println("--------------------");
		
		int a = 100;
		int b = 200;
		System.out.println("a=" + a + ",b=" + b);//a=100,b=200
		// 交换两个变量的值
		int temp = a;
		a = b; // 将变量b的值赋值给变量a
		b = temp; // 将temp赋值给变量b
		System.out.println("a=" + a + ",b=" + b);//a=200,b=100
		
		System.out.println("--------------------");
		int age = 16;
		// 三目运算符 
		// 布尔表达式 ? 表达式1 ： 表达式2    布尔表达式=true 返回表达式1的值，布尔表达式=false 返回表达式2的值
		String str = age>=18 ? "已成年" : "未成年";
		System.out.println(str);
	}
}

// 算术运算符 比较运算符 赋值运算符 三目运算符 逻辑运算符







