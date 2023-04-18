package com.bjpowernode.day15.homework.test02;

public interface UserService {

    /**
     * 存储用户信息
     * @param user
     * @return
     */
    boolean add(User user);


    /**
     * 根据用户名查询用户信息
     * @param username
     * @return
     */
    User getByUsername(String username);


    /**
     * 控制台输出所有用户的信息
     */
    void list();
}
