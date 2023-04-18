package com.bjpowernode.day14;

public class InterfaceDemo01 {

    public static void main(String[] args) {
        // IDemo.i = 200; 错误
        System.out.println(IDemo.I);
        IDemo.m1();
        System.out.println(DemoImpl01.I);

        // 接口中的静态方法不能被子类继承
        // DemoImpl01.m1(); 错误

        // 错误：接口不能被实例化，如果要创建接口的对象，必须先实现接口，创建该接口实现类的对象
        // IDemo iDemo = new IDemo();

        System.out.println("---------------------");
        DemoImpl01 d1 = new DemoImpl01();
        d1.m4(); // Hello interface m4
        d1.m2(); // DemoImpl01 m2
        d1.m3(); // DemoImpl01 m3

        System.out.println("----------------");
        System.out.println(DemoImpl02.I);
    }
}

// 接口中所有的成员都是 public 修饰的
// 接口中的成员变量都是被 public 修饰的静态常量
// 接口中的成员方法都是被 public 修饰的抽象方法


// 接口中的静态方法不能没有方法体，并且是被 public 修饰的 (JDK8之后的功能)
// 接口中非静态的方法，能不能有具体的实现
// 可以，但是方法前需要使用 default 修饰 (JDK8之后的功能)

// 接口中没有构造方法
interface IDemo {
    int I = 100; //public static final int I = 100;

    static void m1() { // public static void m1()
        System.out.println("Hello interface m1");
    }

    void m2();   //public abstract void m12();

    void m3();

    default void m4() {
        System.out.println("Hello interface m4");
    }
}

// 抽象类实现接口，可以部分实现接口中的抽象方法
abstract class DemoImpl02 implements IDemo {
    @Override
    public void m2() {

    }
}

// 一个非抽象类实现接口，要实现接口中所有的抽象方法
class DemoImpl01 implements IDemo {

    @Override
    public void m2() {
        System.out.println("DemoImpl01 m2");
    }

    @Override
    public void m3() {
        System.out.println("DemoImpl01 m3");
    }

    // m4 方法被继承到了子类中
//    @Override
//    public void m4() {
//
//    }
}


class Test {
    public static final int i = 100;
}

// 接口 ---- 抽象类 ----抽象类 ---- 具体类 --- 具体子类