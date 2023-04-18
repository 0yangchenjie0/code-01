package com.bjpowernode.day15.demo03;

public class AnimalDemo03 {

    public static void main(String[] args) {
        Animal ant = new Ant();
        ant.info(); // 蚂蚁

        Animal elephant = new Elephant();
        elephant.info(); // 大象
    }
}

interface Animal {
    void info();
}

class Ant implements Animal {
    @Override
    public void info() {
        System.out.println("蚂蚁");
    }
}

class Elephant implements Animal {
    @Override
    public void info() {
        System.out.println("大象");
    }
}
