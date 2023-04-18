package com.bjpowernode.day04;

/**
赋值运算符
| =    | 赋值       | int a=2                    | 2    |
| +=   | 加后赋值   | int a=2，a+=2              | 4    |
| -=   | 减后赋值   | int a=2，a-=2              | 0    |
| *=   | 乘后赋值   | int a=2，a*=2              | 4    |
| /=   | 整除后赋值 | int a=2，a/=2              | 1    |
| %=   | 取模后赋值 | int a=2，a%=2              | 0    |

**【随堂练习】**
*/

public class OperatorDemo03 {

	public static void main(String[] args) {
		int a = 2;
		a += 2;
		System.out.println(a); //4
		
		a -= 5; // a = a - 5
		System.out.println(a); //-1
		
		a *= 6;
		System.out.println(a); //-6
		
		a /= 2;
		System.out.println(a); //-3
		
		a %= 3; // a = -3 % 3
		System.out.println(a); // 0
		
		System.out.println("-------------------");
		short num = 11;
		// num = num + 1; // 错误: 不兼容的类型: 从int转换到short可能会有损失
		// `+=`，`-=`，`*=`，`/=`  赋值运算符包含了一个强制转换的操作，会将运算后的结果，强制类型转换后赋值。
		num += 1; // int --> short
		
		// int sum += 30; // 错误
	}

}




