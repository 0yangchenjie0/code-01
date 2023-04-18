package com.bjpowernode.day06;

import java.util.Scanner;

/**
 * 输入一个整数 n,判断该数是否是质数
 * 质数是指在大于1的自然数中，除了1和它本身以外不再有其他因数的自然数。
 * eg: 2、3、5、7、11、13、17
 * <p>
 * 7
 * 分别和 2 ~ 6 取余，如果遇到余数等于0，不是质数
 */
public class ForDemo09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个大于1的自然数：");
        int n = scanner.nextInt();

        // 8
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                // 不是质数,计算器+1
                count++;
            }
        }

//        if (count == 0) {
//            System.out.println(n + "是质数");
//        } else {
//            System.out.println(n + "不是质数");
//        }
        System.out.println(count > 0 ? (n + "不是质数") : (n + "是质数"));

    }
}
