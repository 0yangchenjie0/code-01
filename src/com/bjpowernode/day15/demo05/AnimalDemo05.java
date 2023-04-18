package com.bjpowernode.day15.demo05;

/**
 * 一个子类对象是属于父类的数据类型的
 */
public class AnimalDemo05 {

    public static void main(String[] args) {
//        Animal animal = new Animal();
//        System.out.println(animal instanceof Animal); // ture
//
//        Ant ant = new Ant();
//
//        System.out.println(ant instanceof Ant); // ture
//        System.out.println(ant instanceof Animal); // true
//        System.out.println(animal instanceof Ant); // false
//
//        System.out.println("---------------------");
//        // 向上转型 子类对象赋值给一个父类引用
//        Animal animal1 = new Ant();
//        System.out.println(animal1 instanceof Animal); // true
//        // 重点 判断指向父类的子类对象到底是哪个子类的类型
//        System.out.println(animal1 instanceof Ant); // true
//        System.out.println(animal1 instanceof Elephant); // false


        // Animal animal = new Ant();
        Animal animal = new Elephant();
        // 目标：如何访问 animal age成员变量和 test01() 方法呢？

        if (animal instanceof Ant) {
            // 向下转型 将父类引用转为子类引用，这个过程是向下转型。必须使用强制类型转换
            Ant ant = (Ant) animal;
            System.out.println(ant.age); // 1
            ant.test01(); // test01...
            ant.info(); // 蚂蚁
        }

        if (animal instanceof Elephant) {
            Elephant elephant = (Elephant) animal;
            elephant.test02(); // test02...
        }
    }
}


class Animal {
    void info() {

    }
}

class Ant extends Animal {
    int age = 1;

    @Override
    void info() {
        System.out.println("蚂蚁");
    }

    void test01() {
        System.out.println("test01...");
    }

}

class Elephant extends Animal {

    void test02() {
        System.out.println("test02...");
    }
}