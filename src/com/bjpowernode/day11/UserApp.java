package com.bjpowernode.day11;
/**
 * 构造方法方法名称和类名一致
 * 构造方法没有返回值，也不需要声明返回值类型
 * 构造方法不能通过 对象.方法名称()的方式调用，只能在创建对象的时候被调用
 * 类中不定义任何构造方法，编译的时候会编译器会生成一个无参构造方法
 * 如何类中定义了带参数的构造方法，编译器不会再生成无参构造方法,如果想使用无参构造创建对象，需要定义出来无参构造
 *
 * 解决成员变量和构造方法参数同名的问题：
 *  方式一：让成员变量和构造方法参数不同名(不建议)
 *
 *  方式二：
 *  当创建一个对象成功后，虚拟机（JVM）会动态的分配一个引用，该引用指向的就是当前对象，这个引用的名字叫做 this。
 *
 *   this 关键字的作用：
 *     -  解决局部变量和成员变量同名问题
 *
 *
 *  注意：构造方法中可以调用成员方法，成员方法中不能调用构造方法
 */
public class UserApp {
    public static void main(String[] args) {
         User u1 = new User(); // 调用无参构造方法
//        User u2 = new User("admin","123456");
//        System.out.println(u2.username);
//        System.out.println(u2.password);
    }
}

class User {
    // 无参构造
    User() {
        // 构造方法中可以调用成员方法，成员方法中不能调用构造方法
        login();
    }

    User(String username) {
        this.username = username;
    }

    // 带参数的构造
    User(String username, String password) {
        // 将传递进来的参数赋值给成员变量
        this.username = username; // 将参数username的值，赋值给当前对象的 username
        this.password = password;
    }

    String username; // 用户名
    String password; // 密码

    void login() {
        System.out.println("login 方法被调用");
    }
}
