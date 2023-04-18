package com.bjpowernode.day05;
import java.util.Scanner;

/**
 * 判断一个学生的成绩，如果90（包含）~100（包含）为优秀，70（包含）~90为良好，60（包含）~70为及格，60分以下输出不及格。
 * 1.确定数据类型 double
 * 2.score>=0.0 && score<=100 合法的数据范围
 * 分支语句的嵌套
 */
public class IfDemo05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入成绩：");
        // 接收控制台输入的成绩
        double score = scanner.nextDouble();
        // 符合规范的成绩
        if(score >= 0.0 && score <= 100.0) {
            System.out.print("您的成绩是：" + score);
            if (score < 60) {
                System.out.println("，不及格");
            } else if (score < 70) {
                System.out.println("，及格");
            } else if (score < 90) {
                System.out.println("，良好");
            } else {
                System.out.println("，优秀");
            }
        }
        // 不符合成绩规范的输入
        else {
            System.out.println("输入的成绩无效");
        }
    }
}



