package com.bjpowernode.day17;

/**
 * 编程语言中，方法直接或间接调用方法本身，则该方法称为递归方法（核心思想就是**自己调用自己**）。
 * <p>
 * 1.什么时候要调用自己
 * 2.什么时候不再调用自己
 */
public class DiguiDemo01 {

    public static void main(String[] args) {
        m1(1);
    }

    // 输出1-100
    public static void m1(int i) {
        if (i == 7) {
            // 递归的出口
            return;
        } else {
            System.out.println(i);
            m1(++i);
        }
    }
}


