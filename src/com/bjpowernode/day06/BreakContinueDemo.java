package com.bjpowernode.day06;

/**
 * break 用于循环结构，会提前结束循环，当次循环中，break后面的语句也不再执行
 * continue 继续执行下次循环，当次循环 continue 后面的语句不再执行
 */
public class BreakContinueDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 3) {
                // 提前结束循环，执行循环后面的代码
                break;
            }
            System.out.println(i);
        }
        System.out.println("--------------");
        // 1
        // 2

        for (int i = 1; i <= 10; i++) {
            if (i == 3) {
                // 提前结束当次循环，继续执行下一次循环
                continue;
            }
            System.out.println(i);
        }

    }
}
