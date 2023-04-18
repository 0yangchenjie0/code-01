package com.bjpowernode.day13;

/**
 * private 修饰构造方法，其它类无法创建该类的对象
 * private 修饰普通成员方法，该成员方法无法被其它类调用
 * private 修改成员变量，该成员变量无法被其它类访问
 */
public class PrivateDemo01 {

    public static void main(String[] args) {
        // 创建User类的对象
        // new User();

        User user = new User("jack");
        // user.sayHello();
        // user.name
        System.out.println(user.getName()); //jack
        user.setName("rose");
        System.out.println(user.getName()); //rose

    }
}


class User {
    // 私有的构造方法，该构造方法只能在当前类被访问
    private User() {
        System.out.println("init...");
    }

    User(String name) {
        this();
        this.name = name;
        sayHello();
    }

    private String name; // 私有的成员变量

    String getName() {
        return this.name;
    }

    void setName(String name) {
        this.name = name;
    }

    // 私有的成员方法
    private void sayHello() {
        System.out.println("Hello:" + this.name);
    }
}
