package com.bjpowernode.day03;
/**
 字符型在内存中占有 2 个字节，[0,65535] 在 Java 中使用单引号包裹起来的一个字符称之为字符常量。
 例如 'A' 是一个字符，它与 "A" 是不同的， "A" 表示含有一个字符的字符串。
 补充：
 char 类型表示的是 Unicode 编码表中的字符，所以可以表示一个中文字符。
 char 类型和 int 类型的联系和区别
 char 类型常量在内存中存储的就是 Unicode 编码值，例如：'A' -- 65, '1' -- 49。
 在一定范围内，char 类型和 int 类型是可以通用的:
 每个字符都有一个数字和其对于
 */
public class DataType04 {

	public static void main(String[] args) {

		char c1 = 'a'; // 正确
		char c2 = '8'; // 正确
		char c3 = 'A'; // 正确
		char c4 = '家'; // 正确
		// char c5 = '';  // 错误: 空字符文字
		// char c6 = '大家'; // 错误，字符类型只能有一个字符


		char v1 = 'A';
		System.out.println(v1); //A
		System.out.println(v1 + 1); // 66  'A' --- 65

		char v2 = 97;
		System.out.println(v2); //a

		// char v3 = -100; // 错误: 不兼容的类型: 从int转换到char可能会有损失
	}
}









