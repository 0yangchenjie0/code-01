package com.bjpowernode.day03;
/**
强制类型转换(显示类型转换)，
     主要用于显式的转换一个数值的类型。在有可能丢失信息的情况下进行的转换是通过造型来完成的，但可能造成精度降低或溢出。
     语法格式：
      目标类型 变量 =（目标类型）源类型变量或常量

*/
public class DataType06 {

	public static void main(String[] args) {
	  // System.out.println(Long.MAX_VALUE); //9223372036854775807
	  // int i = 100L; // 错误: 不兼容的类型: 从long转换到int可能会有损失
	  
	  // 强制类型转换
	  int i1 = (int) 100L;
	  System.out.println(i1); //100
	  
	  // 强制类型转换可能会造成数据精度损失
	  int i2 = (int) 9223372036854775807L;
	  System.out.println(i2); // -1 // 溢出
	  
	  
	  int i3 = (int) 10.28;
	  System.out.println(i3); // 10 // 精度损失
	}
}









