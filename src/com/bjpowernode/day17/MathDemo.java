package com.bjpowernode.day17;

public class MathDemo {

    public static void main(String[] args) {
        System.out.println(Math.PI); // 3.141592653589793
        System.out.println(Math.E); // 2.718281828459045

        System.out.println("----------------");
        // 四舍五入取整数
        System.out.println(Math.round(3.6));

        // 返回大于参数的最小整数（天花板取整）。
        System.out.println(Math.ceil(3.6)); //4.0
        // 返回小于参数的最大整数（地板取整）。
        System.out.println(Math.floor(3.6)); //3.0

        System.out.println(Math.max(100,200));//200
        System.out.println(Math.min(100,200));//100

        // 绝对值
        System.out.println(Math.abs(10)); //10
        System.out.println(Math.abs(-10));//10
        // 次幂
        System.out.println(Math.pow(2,3)); // 8.0
        // 开平方根
        System.out.println(Math.sqrt(9)); //3.0

        // 获取随机数 返回 0.0（包含） 到 1.0（不包含） 的随机数。
        System.out.println(Math.random()); // 0.28875646974483427


        // 获取1到10之间的随机数[1,10]  [0,10)
        int num = (int) (Math.random() * 10 + 1);
        System.out.println(num);

        // 返回大于参数的最小整数
        System.out.println(Math.ceil(Math.random() * 10));

    }
}
