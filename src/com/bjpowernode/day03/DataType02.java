package com.bjpowernode.day03;
/**
浮点数（浮点型）
  默认使用 double
  float   单精度浮点数
  double  双精度浮点数
  float	    4字节	-3.403E38 ~ 3.403E38
  double	8字节	-1.798E308 ~ 1.798E308
    1.浮点型常量默认为 double 类型。
	2.浮点型常量赋值给 float 类型，需要在常量后面添加 f 或 F。
	3.浮点型常量赋值给 double 类型，可以在常量后面添加 d 或 D。
	4.避免直接比较两个浮点数的大小，这样比较可能会出现问题。
*/
public class DataType02 {

	public static void main(String[] args) {
	   // float f = 3.14; // 错误: 不兼容的类型: 从double转换到float可能会有损失
	   float f = 3.14F; // 定义float类型的浮点数，必须添加f或F
	   System.out.println(f);
	   
	   double d1 = 3.14; // double 是默认的浮点数类型
	   System.out.println(d1);
	   
	   // 可以使用科学计数法表示浮点数
	   double d2 = 1.7976931348623157E308D;
	   System.out.println(d2);
	   
	   double d3 = 3.14D;
	   System.out.println(d3);
	   
	}
}









