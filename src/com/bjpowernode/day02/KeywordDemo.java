package com.bjpowernode.day02;
/**
关键字
   关键字：public、class、static、final、void、int、double、char
   什么是关键字：关键字是被 Java 语言赋予特殊含义，具有专门用途的单词，不能再做其它使用。
   特点：
	 每个关键字有专门用途（不能再用于其它用途）
	 关键字全部是小写
	 变量名称、常量名称、方法名称、类名不能使用关键字
标识符
  标识符是程序员在编写代码的时候，给 变量、常量、类、方法.... 起的名称。
  1.标识符的命名规则
  
    a.标识符有 字母（a-zA-z）、数字（0-9）、下划线(_)、美元符号($) 组成
    b.标识符不能以数字开头
    c.标识符不能使用关键字
*/
public class KeywordDemo {
	public static void main(String[] args) {
	    // int final = 100; 错误 标识符不能使用关键字
	    int age = 100;
	    // int 10age = 20; 错误：标识符不能以数字开头
	    // int @age = 20;  错误:标识符有 字母（a-zA-z）、数字（0-9）、下划线(_)、美元符号($) 组成
	    int $age = 30; // 正确
	    int _age = 20; // 正确
	    int age10 = 30; // 正确
	    // int age%10 = 20; // 错误
	    int 年龄 = 18; // 可以使用汉字作为标识符，但不建议使用
	    System.out.println(年龄);
	}
}