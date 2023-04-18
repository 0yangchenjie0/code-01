package com.bjpowernode.day15.homework.test02;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // 创建一个 ArrayList 的对象，该集合只能放用户对象
        ArrayList<User> list = new ArrayList<>();
        // 获取集合的长度
        System.out.println(list.size()); // 0

        list.add(new User("001", "123", "jack", 18));
        list.add(new User("002", "123", "jack", 18));
        list.add(new User("003", "123", "jack", 18));
        list.add(new User("004", "123", "jack", 18));
        System.out.println(list.size()); // 4

        // 获取集合的元素
//        System.out.println(list.get(0));
//        System.out.println(list.get(1));
//        System.out.println(list.get(2));
//        System.out.println(list.get(3));
        // System.out.println(list.get(4)); 异常
        System.out.println("----------------------------------");

        for (User user : list) {
            System.out.println(user);
        }

        System.out.println("----------------------------------");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
