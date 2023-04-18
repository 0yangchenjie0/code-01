package com.bjpowernode.day06;

/**
 * 求 100 到 999 之间的水仙花数。水仙花数的每个位上的数字的 3 次幂之和等于它本身（例如：1^3 + 5^3+ 3^3 = 153）。
 * <p>
 * 1^3 + 5^3+ 3^3 = 153
 * 1.遍历100到999之间所有整数
 * 2.计算当前循环到的数字的 个位  十位 百位
 */
public class ForDemo07 {
    public static void main(String[] args) {
        // 1.遍历100到999之间所有整数
        for (int i = 100; i <= 999; i++) {
            int n1 = i % 10; // 个位
            int n2 = (i % 100) / 10; // 十位
            int n3 = i / 100; // 百位
            // 2.判断当前的 i 是否是水仙花数
            if(i == n1 * n1 * n1 + n2 * n2 * n2 + n3 * n3 * n3) {
                System.out.println(i);
            }
        }

//        int i = 154;
//        int n1 = i % 10; // 个位
//        int n2 = (i % 100) / 10; // 十位
//        int n3 = i / 100; // 百位
//
//        System.out.println(n1); //3
//        System.out.println(n2); //5
//        System.out.println(n3); //1
//
//        System.out.println(i == n1 * n1 * n1 + n2 * n2 * n2 + n3 * n3 * n3);
    }
}
