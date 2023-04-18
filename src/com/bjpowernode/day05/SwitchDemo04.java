package com.bjpowernode.day05;

/**
 * switch() 中的数据类型只能为：byte、short、int、char、String（JDK7）和枚举 (后面会学习)。
 */
public class SwitchDemo04 {
    public static void main(String[] args) {
        char input = 'B';
        switch (input) { // input == 1
            case 'A': {
                System.out.println("苹果：6块/斤");
                break;
            }
            case 'B': {
                System.out.println("香蕉：3块/斤");
                break;
            }
            default: {
                System.out.println("输入代码错误");
            }
        }
    }
}
