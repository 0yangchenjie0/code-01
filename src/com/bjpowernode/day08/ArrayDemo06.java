package com.bjpowernode.day08;

/**
 * 获取10个学生的成绩，然后保存在数组中，最后计算学生的总分和平均分。
 * 分析：
 * 长度10
 * 数据类型 double
 */
public class ArrayDemo06 {
    public static void main(String[] args) {
        double[] scores = {90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0};
        System.out.println(scores.length);
        // 定义一个变量存储学生的总分数
        double total = 0.0;
        for (int i = 0; i < scores.length; i++) {
            total += scores[i];
        }
        System.out.println("总分：" + total);
        System.out.println("平均分：" + total / scores.length);
    }
}
