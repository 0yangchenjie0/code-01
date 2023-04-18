package com.bjpowernode.day15.homework.test02;

import java.util.ArrayList;

/**
 * 集合版的实现
 */
public class UserServiceListImpl implements UserService {

    // 定义一个集合
    ArrayList<User> list = new ArrayList<>();

    @Override
    public boolean add(User user) {
        // 判断该用户是否已经在集合中
        User u = this.getByUsername(user.getUsername());
        if (u != null) {
            // 要添加的用户在数据已经存在
            System.out.println("添加用户失败," + user.getUsername() + "：已存在");
            return false;
        }

        // 将用户添加到集合
        list.add(user);
        System.out.println("添加用户成功，用户名：" + user.getUsername());
        return true;
    }

    @Override
    public User getByUsername(String username) {
        for (User user : list) {
            if (user != null && user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public void list() {
        for (User user : list) {
            System.out.println(user);
        }
    }
}
