package com.bjpowernode.day14;

/**
 * 抽象类案例
 * 被 abstract 修饰的类，称为抽象类
 * 方法被 abstract 修饰，该方法称为抽象方法，如果一个类中有抽象方法，该类必须是抽象类
 * 抽象方法只有方法声明，没有具体的方法体{}
 *
 *
 * 如果一个类中有抽象方法，该类必须是抽象类
 * 如果一个类是抽象类，该类可以没有抽象方法
 * 抽象类中可以有非抽象方法
 *
 * 如果一个非抽象类继承了一个抽象类，子类要实现父类中的所有抽象方法
 * 如果一个抽象类继承另一个抽象类，可以实现父类的抽象方法，也可以不实现
 *
 * 抽象类不能被实例化，不能创建抽象类的对象
 */
public class AbstractDemo01 {
    public static void main(String[] args) {

        MIhone mi = new MIhone();
        mi.info();

        VivoPhone vivo = new VivoPhone();
        vivo.info();

        // 抽象类不能被实例化
        // Phone phone = new Phone();
        // phone.info();
    }

}

// 手机类
abstract class Phone {

    Phone() {

    }

    // 输出手机的详细信息
    abstract void info();
    abstract void test();

    void m() {

    }
}

abstract class IPhone extends Phone {
    @Override
    void info() {
        System.out.println("我是苹果");
    }
    abstract void test();
}

class MIhone extends Phone {
    @Override
    void info() {
        System.out.println("我是小米");
    }

    @Override
    void test() {

    }
}

class VivoPhone extends Phone {

    @Override
    void info() {
        System.out.println("我是vivo");
    }

    @Override
    void test() {

    }
}