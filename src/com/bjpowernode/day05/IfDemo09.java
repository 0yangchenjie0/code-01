package com.bjpowernode.day05;

/**
 * 1、 如果if选择结构只需执行一条语句时，那么可以省略{}；如果需要执行多条语句，那么就是不能省略{}。为了提高代码的易读性，建议不要省略{}。
 * 2、 {}中的代码语句也称为代码块，在代码块定义的常量或变量的作用域仅限于代码块中，在代码块之外不能被使用。
 * 3、 能用if多选择结构就不要用if单选择结构，因为if多选择结构的效率要高于if单选择结构。
 * 4、 在if选择结构中还可以嵌套别的选择结构或循环结构。
 */
public class IfDemo09 {
    public static void main(String[] args) {
//        int i = 100;
//        // 如果if选择结构只需执行一条语句时，那么可以省略{}
//        if (i >= 100)
//            System.out.println("A");
//        System.out.println("B");

        int m = 200;
        {
           int i = 100;
           System.out.println("i=" + i);
           System.out.println("m=" + m);
        }
        // {}中的代码语句也称为代码块，在代码块定义的常量或变量的作用域仅限于代码块中，在代码块之外不能被使用。
        // System.out.println(i);
    }
}
