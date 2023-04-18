package com.bjpowernode.day12;

/**
 * 代码块的执行顺序
 */
public class BlockDemoApp {
    public static void main(String[] args) {
        // System.out.println(BlockDemo.MAX_VALUE); // 2
        // System.out.println(BlockDemo.MAX_VALUE); // 2

        new BlockDemo();
        System.out.println(BlockDemo.MAX_VALUE); // 4

        new BlockDemo();
        System.out.println(BlockDemo.MAX_VALUE); // 6
    }
}
