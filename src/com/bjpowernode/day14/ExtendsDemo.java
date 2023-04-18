package com.bjpowernode.day14;

public class ExtendsDemo {
    public static void main(String[] args) {

        Child child = new Child();
        child.name = "jack";
        child.age = 18;

    }
}


class Parent {
    Parent() {

    }
    String name;
}

class Child extends Parent {
    Child() {
        super();
    }
    int age;
}