package com.bjpowernode.day17;

/**
 * 计算 n 的阶乘。f(n) = f(n-1)  *  n  (n>1)
 * <p>
 * 4  1*2*3*4
 */
public class DiguiDemo02 {

    public static void main(String[] args) {
        System.out.println(f1(4)); //24
    }

    public static int f1(int n) {
        if (n == 1) {
            return 1;
        } else {
            return f1(n - 1) * n;
        }
    }
}

// n=4  f1(3) * 4
// n=3  f1(2) * 3 * 4
// n=2  f1(1) * 2 * 3 * 4
// n=1      1 * 2 * 3 * 4
