package com.bjpowernode.day04;

/**
 逻辑运算符
 ! 逻辑非
 && 逻辑与 （and）并且 (遇假则假)
 || 逻辑或  (or)  或者（见真则真）
 
 
*/
public class OperatorDemo05 {

	public static void main(String[] args) {
		System.out.println(true); // true
		System.out.println(!true);  // false
		System.out.println(!false); // true
		
		System.out.println("----------------"); 
		// 用户登录：账号和密码都正确
		System.out.println(true && true); // true
		System.out.println(true && false);// false
		System.out.println(false && true);// false
		System.out.println(false && false);// false
		
		// 购房：当地缴纳社保半年以上 或者 当地纳税满一年
		System.out.println("----------------");
		System.out.println(true || true); // true
		System.out.println(true || false);// true
		System.out.println(false || true);// true
		System.out.println(false || false);// false
		
		
		System.out.println("----------------"); 
		
		int i = 10;
		int j = 20;
		
		// System.out.println(i > j && ++j ==21); //false
		// System.out.println("j=" + j); //20
		
		// System.out.println(i < j && ++j ==21); //true
		// System.out.println("j=" + j); //21
		
		// System.out.println(i > j || ++j ==21); //true
		// System.out.println("j=" + j); //21
		
		System.out.println(i < j || ++j ==21); // true
		System.out.println("j=" + j); //20
		
		
		System.out.println("----------------"); 
		
		// 判断一个数是否在5（包含）~16（不包含）之间
		int num1 = 10;
		System.out.println(num1 >= 5 && num1 < 16); //true
		
		// 判断一个数是否在5（不包含）~16（包含）之外；
		int num2 = 20;
		System.out.println(num2 < 5 || num2 >=16); // true
	}

}




