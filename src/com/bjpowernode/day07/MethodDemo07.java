package com.bjpowernode.day07;

/**
 *   返回值类型不同，不构成方法的重载。语法错误，一个类中不允许出现方法名称和参数完全一致，但返回值不同的方法
 *   方法的参数名称不同，不构成方法的重载。语法错误
 *   方法修饰符不同，不构成方法的重载。语法错误
 *
 *   总结：方法的重载只和 方法名称，参数类型，参数个数，参数顺序有关
 */
public class MethodDemo07 {

    public static void main(String[] args) {
        add(100);
    }


    static void add(int i) {
        System.out.println(i);
        System.out.println();
    }

    // 方法修饰符不同，不构成方法的重载。语法错误
//    public static void add(int i) {
//
//    }


      // 返回值类型不同，不构成方法的重载。语法错误
//    public static int add(int i) {
//        return 0;
//    }

      // 方法的参数名称不同，不构成方法的重载。语法错误
//    public static void add(int j) {
//
//    }

}
