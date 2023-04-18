package com.bjpowernode.day04;

/**
1.算术运算符
 + 正号、算术加、字符串拼接
 - 负号、算术减
 * 乘法
 / 除法
 % 取模（取余）
 ++ 自增
 -- 自减

- 加法运算符在连接字符串时，只有直接与字符串相加才会转成字符串；
- 两个整数做除法（/）运算，结果只保留整数。当其中一边为浮点型时，按正常规则相除；
- `%` 为整除取余符号，小数取余没有意义。结果符号与被取余符号相同；
- `0` 不能做除数，否则报错；
- `i++`,`i--` 先使用变量 `i` 原有值参与运算操作，运算操作完成后，变量`i`的值自增1或者自减1；
- `++i`,`--i`先将变量`i`的值自增1或者自减1，然后使用更新后的新值参与运算操作。
*/

public class OperatorDemo01 {

	public static void main(String[] args) {
		int a = +100;
		int b = -100;
		// 改变变量的负号
		a = -a;
		System.out.println(a);// -100
		System.out.println(b);// -100
		System.out.println(a + b);// -200
		System.out.println(a - b);// 0
		System.out.println("------------------------------");
		// 字符串拼接  字符串和其它任意数据类型使用 + 符号连接，计算的结果都是字符串
		System.out.println(1 + 1 + "Hello"); // 2Hello
		System.out.println(1 + 1 + "Hello" + 1);// 2Hello1
		System.out.println("Hello" + 1 + 1);//Hello11
		System.out.println("Hello" + " World" + 1 + 1);//Hello World11
		
		System.out.println("------------------------------");
		System.out.println(10 * 3); // 30
		System.out.println(10 / 3); // 3
		System.out.println(10 / 3.0); // 3.3333333333333335
		System.out.println("------------------------------");
		// `0` 不能做除数，否则报错
		/**
		Exception in thread "main" java.lang.ArithmeticException: / by zero
        at OperatorDemo01.main(OperatorDemo01.java:45)
		*/
		// System.out.println(100/0);
		// 取余（模）`%` 为整除取余符号，小数取余没有意义。结果符号与被取余符号相同
		System.out.println(10 % 3); // 1
		System.out.println(10 % 3.0); // 1.0
		System.out.println(10.0 % 3); // 1.0
		System.out.println(10 % -3); // 1
		System.out.println(-10 % 3); // -1
		// 小数取余没有意义
		System.out.println(10 % 0.5); // 0.0
	}
}




