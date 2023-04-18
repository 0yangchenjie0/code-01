package com.bjpowernode.day03;
/**
整数（整型）
  默认使用 int
  byte   1个字节   -128  ~ 127
  short  2个字节   -32768 ~ 32767
  int    4个字节   -2147483648 ~ 2147483647
  long   8个字节   [-2^63, 2^63 -1]  [-9223372036854775808, 9223372036854775807]
  【注意事项】
	1.注意数据类型的表数范围，避免出现超出表数范围精度丢失的情况。
    2.整型常量默认为 int 类型，声明 long 型常量可以加 l 或 L，建议使用 L 。
*/
public class DataType01 {

	public static void main(String[] args) {
	   // byte b = 128; // 错误: 不兼容的类型: 从int转换到byte可能会有损失
	   byte b = 100;
	   System.out.println(b);
	   
	   // short s = 32768; // 错误: 不兼容的类型: 从int 转换到 short 可能会有损失
	   short s = 32767;
	   System.out.println(s);
	   
	   
	   // int i = 2147483648; // 错误: 过大的整数: 2147483648
	   int i = 2147483647;
	   System.out.println(i);
	   
	   
	   // long max = 9223372036854775807; // 错误: 过大的整数: 9223372036854775807
	   long max = 9223372036854775807L; 
	   System.out.println(max);
	   
	   // 如果给long 变量赋值的内容在 int 能表示的范围内，可以省略 L
	   long num = 1024;
	   System.out.println(num);
	}
}









