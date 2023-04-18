// 如何创建的类在指定的一个包下，必须使用 package 声明当前类在哪个包
// 在src直接创建的类没有指定包，不需要 package 声明
package com.bjpowernode.day12.packagedemo;

// 使用 import关键字导入其它包的类
//import java.util.Arrays;
//import java.util.Random;
//import java.util.Scanner;
//import java.util.*; // 导入 java.util 包下的所有类

// 不能使用 import 导入两个同名的类

import java.util.Date;

import static java.lang.Math.PI;
import static java.lang.Math.max;

public class HelloWorld {

    public static void main(String[] args) {
        // 在同一个包下，创建另一个类的对象，不需要任何额外的导入的
        User user = new User();

        // 通过 包名.类名
//        java.util.Arrays.toString(new int[]{1, 2});
//        java.util.Random random = new java.util.Random();
//        java.util.Scanner scanner = new java.util.Scanner(System.in);

//        Arrays.toString(new int[]{1,2});
//        Random random = new Random();
//        Scanner scanner = new Scanner(System.in);

          Date date1 = new Date();
          java.sql.Date date2 = new java.sql.Date(0);

//          java.lang.String str = "Hello";
//          java.lang.System.out.println("");

        // java.lang 包下的类不需要声明包
        String str = "";
        System.out.println("");

        System.out.println("------------------------");
        System.out.println(Math.PI);
        System.out.println(PI);
        System.out.println(Math.max(100,200));
        System.out.println(max(100,200));
    }

}
