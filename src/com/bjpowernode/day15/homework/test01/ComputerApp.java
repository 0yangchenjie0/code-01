package com.bjpowernode.day15.homework.test01;

public class ComputerApp {


    public static void main(String[] args) {
        // 1.定义一个加法运算
        Computer doAdd = new Computer() {
            @Override
            public double result(double a, double b) {
                return a + b;
            }
        };

        Computer doSub = new Computer() {
            @Override
            public double result(double a, double b) {
                return a - b;
            }
        };
        System.out.println(doAdd.result(100, 200));
        System.out.println(doSub.result(100, 200));

        System.out.println("----------------------------------------------------");

        // 匿名对象作为方法的参数传递
        // System.out.println(add(doAdd,100,200)); //300


        double result = add(new Computer() {
            @Override
            public double result(double a, double b) {
                return a + b;
            }
        }, 10, 20);
        System.out.println(result); //30.0


        // 后面会学习
        double result1 = add((double a, double b) -> a + b, 10, 20);
        System.out.println(result1); //30.0
    }


    public static double add(Computer computer, double a, double b) {
        return computer.result(a, b);
    }
}
