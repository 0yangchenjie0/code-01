package com.bjpowernode.day13;

public class OverrideDemo {

    public static void main(String[] args) {
        C2 c2 = new C2();
        c2.sayHello(); // 我是子类
        c2.test01(); //C2.test01
    }
}


class C1 {
   void sayHello() {
       System.out.println("我是父类");
   }

   // 私有的方法不能被子类继承
   private void test01() {
       System.out.println("C1.test01");
   }

   int sum(int a, int b) {
       return a + b;
   }
}

class C2 extends C1 {

    @Override // 标注该方法重写的父类的方法
    void sayHello() {
        System.out.println("我是子类");
    }

    // @Override 不能使用 @Override 注解
    void test01() { // 不是方法的重写，而是子类自己的方法
        System.out.println("C2.test01");
    }

    // @Override 错误
    void sayHi() {

    }

    @Override
    int sum(int a, int b) {
        return super.sum(a, b);
    }
}
