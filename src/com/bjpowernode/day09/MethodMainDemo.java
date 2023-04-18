package com.bjpowernode.day09;

/**
 * main方法的参数
 */
public class MethodMainDemo {

    /**
     * main是程序运行的入口，由虚拟机发起对main方法的调用
     * main方法接收一个字符串数组
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(args.length);
        for (String str : args) {
            System.out.println(str);
        }
    }
}
