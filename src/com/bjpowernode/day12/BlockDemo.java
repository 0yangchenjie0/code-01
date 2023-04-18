package com.bjpowernode.day12;

public class BlockDemo {
    static int MAX_VALUE;

    static {
        System.out.println("静态代码块1");
        MAX_VALUE++;
    }

    static {
        System.out.println("静态代码块2");
        MAX_VALUE++;
    }


    {
        System.out.println("构造代码块1");
        MAX_VALUE++;
    }


    {
        System.out.println("构造代码块2");
        MAX_VALUE++;
    }
}
