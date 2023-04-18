package com.bjpowernode.day05;

import java.util.Scanner;

/**
 * 输入 一 ~ 七
 * 如果是周一到周五，打印输出工作日
 * 如果是周六和周日，打印输出休息日
 */

public class SwitchDemo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入大写一到七：");
        String week = scanner.next();
        switch (week) {
            case "一":
            case "二":
            case "三":
            case "四":
            case "五": {
                System.out.println("工作日");
                break;
            }
            case "六":
            case "七": {
                System.out.println("休息日");
                break;
            }
            default: {
                System.out.println("参数输入错误");
                break;
            }
        }
    }
}
