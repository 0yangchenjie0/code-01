package com.bjpowernode.day03;
/**
自动类型转换 自动类型转换（隐式类型转换）指的是容量小的数据类型可以自动转换为容量大的数据类型
  byte->short->int->long->float->double
    boolean类型不能和其它基本数据类型相互转换
	char 类型不能和 short 或 byte 自动转换
	byte、short、char 运算时直接提升为 int
*/
public class DataType05 {

	public static void main(String[] args) {

        char c = 'A';
        System.out.println(c + 1); // 66
        
        byte b = 100;
        short s = 100;
        
        // short result = b + s; // 错误: 不兼容的类型: 从int转换到short可能会有损失
        int result = b + s; // byte、short、char 运算时直接提升为 int
        System.out.println(result); //200
        
        System.out.println("------------------------------");
        
        byte n1 = 11;
        byte n2 = 22;
        // byte r1 = n1 + n2; //错误: 不兼容的类型: 从int转换到byte可能会有损失
        int r1 = n1 + n2;
        System.out.println(r1); //33
        
        System.out.println("------------------------------");
        
        
        // int n3 = 100000L * 100000 * 100000; //  错误: 不兼容的类型: 从long转换到int可能会有损失
        // long n3 = 100000 * 100000 * 100000L; // 错误：100000 * 100000 超出int的范围
        long n4 = 100000L * 100000 * 100000;
        System.out.println(n4); // 1000000000000000
        
        
		long num1 = 90000; 
	    long num2 = 90000; 
	    long total = num1 * num2 * 1L;
	
	    System.out.println(total); // 8100000000
	    System.out.println(Long.MAX_VALUE);
	    //9223372036854775807
	    //8100000000  
	    //2147483647 
	  
	  
        
	}
}









