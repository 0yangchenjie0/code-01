package com.bjpowernode.day06;

/**
 * 打印[1,10]所有整数
 */
public class WhileDemo02 {
    public static void main(String[] args) {

//        for (int i = 1; i <= 10; i++) {
//
//        }
        int i = 1;
        while (i <= 10) {
//            System.out.println(i);
//            i++;
            System.out.println(i++);
        }

        System.out.println("i=" + i);
    }
}
