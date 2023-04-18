package com.bjpowernode.day13;

public class ExtendsDemo02 {

    public static void main(String[] args) {
        A1 a1 = new A1();
        System.out.println(a1.i); //100

        A2 a2 = new A2();
        // 子类出现和父类同名的成员变量,默认访问的是自己的成员变量
        System.out.println(a2.i); //300
        // 获取父类的成员变量
        System.out.println(a2.getSuperI()); //100

        System.out.println(a2.j); //200
    }
}

class A1 {
    // 私有的成员变量不能被子类访问
    // private int i = 100;

    int i = 100;
}

class A2 extends A1 {

    int i = 300;
    int j = 200;

    int getSuperI() {
        // return this.i;
        // 获取父类的成员变量
        return super.i;
    }
}
