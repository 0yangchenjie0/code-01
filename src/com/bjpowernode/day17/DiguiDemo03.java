package com.bjpowernode.day17;

/**
 * 不死神兔，假如有一对兔子，从出生后第 3 个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，
 * 假如兔子都不死，请问第n个月后的兔子有多少对？(斐波那契数列)  f(n) = f(n - 1) + f(n - 2)
 */
public class DiguiDemo03 {

    public static void main(String[] args) {
        //System.out.println(f3(48));
        System.out.println(f4(48));
    }


    // 数组实现
    public static long f3(int n) {
        // 就用来存储已经得到结果的第n项的斐波那契数列的值
        int[] arr = new int[n + 1];
        arr[1] = 1;
        arr[2] = 1;
        for (int i = 3; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }

    // 递归实现
    public static int f4(int n) {
        if (n == 2 || n == 1) {
            return 1;
        } else {
            return f4(n - 1) + f4(n - 2);
        }
    }
}
