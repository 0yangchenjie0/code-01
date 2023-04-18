package com.bjpowernode.day15.demo01;

public class AnimalDemo01 {

    public static void main(String[] args) {
        // 父类引用指向子类对象
        Animal ant = new Ant(); // 蚂蚁是动物
        ant.info(); // 蚂蚁

        Animal elephant = new Elephant();// 大象是动物
        elephant.info(); //大象
    }
}


class Animal {
    void info() {
        System.out.println("动物");
    }
}

/**
 * 子类继承父类
 * 子类重写父类的方法
 */
class Ant extends Animal {
    @Override
    void info() {
        System.out.println("蚂蚁");
    }
}

class Elephant extends Animal {
    @Override
    void info() {
        System.out.println("大象");
    }
}