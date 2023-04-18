package com.bjpowernode.day14;

public class ObjectDemo02 {
    public static void main(String[] args) {
        User user1 = new User("jack", 18);
        User user2 = new User("jack", 18);

        User user3 = user2;

        // System.out.println(user.toString());
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user1 == user2); // false
        System.out.println(user1.equals(user2)); // true
        System.out.println(user3 == user1); // false
        System.out.println(user3.equals(user1)); // true


    }
}


class User extends Object {
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        // 判断两个对象的地址是否一样
        if (obj == this) return true;
        // 强制类型转换
        User user = (User) obj;
        if (!this.name.equals(user.name)) return false;
        if (this.age != user.age) return false;
        return true;
    }
}
