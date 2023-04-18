package com.bjpowernode.day06;

/**
 * 输出0(包含)到10(包含)之间的数，分别以递增和递减的方式实现；
 */
public class ForDemo03 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("----------");

        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }

    }
}
