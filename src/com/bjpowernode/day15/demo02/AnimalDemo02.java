package com.bjpowernode.day15.demo02;

public class AnimalDemo02 {
    public static void main(String[] args) {
        Animal ant = new Ant();
        ant.info(); // 蚂蚁

        Animal elephant = new Elephant();
        elephant.info(); // 大象
    }

}

abstract class Animal {
    abstract void info();
}

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