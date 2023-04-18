package com.bjpowernode.day15.demo11;

public class InnerClassDemo11 {

    public static void main(String[] args) {
        //1.声明一个子类继承Animal，匿名创建该子类的对象，调用该子类对象的info方法
//        new Animal() {
//            @Override
//            void info() {
//                System.out.println("蚂蚁");
//            }
//        }.info();

        new Animal() {
            @Override
            public void info() {
                System.out.println("蚂蚁");
            }
        }.info();

    }
}


//abstract class Animal {
//    abstract void info();
//}

interface Animal {
    void info();
}
