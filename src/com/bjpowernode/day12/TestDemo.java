package com.bjpowernode.day12;

/**
 * 使用静态变量的场景和优点：
 * 一般存储该类的一些公共特征（属性）
 */
public class TestDemo {
    public static void main(String[] args) {
        // Integer.MAX_VALUE = 100;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.isInt(214748364700L));
    }
}


// 用来描述 int 数据类型的类
// 静态变量建议使用大写名称，多个单词使用 _ 分割
class Integer {

    static final int MAX_VALUE = 2147483647; // 静态常量
    static final int MIN_VALUE = -2147483648; // 静态常量

    /**
     * 判断一个 long 类型的整数是否在 int 类型的范围
     * 在：返回 true
     * 不在 返回 false
     */
    static boolean isInt(long num) {
        return num >= Integer.MIN_VALUE && num <= Integer.MAX_VALUE;
    }
}