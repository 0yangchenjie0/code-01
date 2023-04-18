package com.bjpowernode.day04;

/**
 位运算
*/
public class OperatorDemo07 {

	public static void main(String[] args) {
		System.out.println(3<<1); // 6 3 * 2^1
		System.out.println(3<<2); // 12
		System.out.println(6>>1); // 6/2 = 3
		System.out.println(6>>2); // 6/4 = 1
		
		System.out.println("----------------");
		
		System.out.println(7 & 3); //3
		System.out.println(7 | 3); //7
		System.out.println(7 ^ 3); //4
		System.out.println(~7); // -8
		
		System.out.println("----------------");
		
		int i = 5;
		System.out.println(1 + 2*3 + ++i * (5 + 1)); //43
		// 1 + 6 + 6 * 6 = 43
		
	}
}
/**
位都为1，结果才为1，否则结果为0
  0111
& 0011
  0011

位只要有一个为1，那么结果就是1，否则就为0 
  0111
| 0011
  0111
 
两个操作数的位中，相同则结果为0，不同则结果为1 
  0111
^ 0011
  0100
  
如果位为0，结果是1，如果位为1，结果是0

  0000 0111
~ 1111 1000
     


*/



