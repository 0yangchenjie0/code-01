package com.bjpowernode.day15.demo10;

/**
 * 匿名内部类
 * 匿名内部类是局部内部类的一种
 * 前提条件：
 * 使用匿名内部类前提是必须继承一个父类或实现一个接口，是创建某个类型子类对象的快捷方式。
 * <p>
 * 匿名内部类只能创建一个对象
 */
public class InnerClassDemo10 {
    public static void main(String[] args) {

        // {} 表示的是一个类，这个类没名字
        /**
         new Animal() {
         // 在匿名类中重写父类的 info 方法
         @Override void info() {
         System.out.println("蚂蚁");
         }
         }.info(); **/

        // 创建 Animal 子类的同时，创建该子类的对象，并且赋值给 ant，ant 是animal的一个子类对象
        Animal ant = new Animal() {
            @Override
            void info() {
                System.out.println("蚂蚁");
            }
        };
        ant.info();

        Animal elepant = new Animal() {
            @Override
            void info() {
                System.out.println("大象");
            }
        };
        elepant.info();
    }
}

class Animal {
    void info() {
        System.out.println("动物");
    }
}


//class Ant extends Animal {
//    @Override
//    void info() {
//        System.out.println("蚂蚁");
//    }
//}
