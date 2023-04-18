package com.bjpowernode.day15.homework.test02;

/**
 * 数组版实现
 */
public class UserServiceArrayImpl implements UserService {

    // 定义一个用户数组
    private User[] arr = new User[10];

    @Override
    public boolean add(User user) {
        // 判断用户是否已经在数组中
        User u = this.getByUsername(user.getUsername());

        if (u != null) {
            // 要添加的用户在数据已经存在
            System.out.println("添加用户失败," + user.getUsername() + "：已存在");
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                arr[i] = user;
                // 跳出当前循环
                // break;
                // 提前结束方法调用
                System.out.println("添加用户成功，用户名：" + user.getUsername());
                return true;
            }
        }
        System.out.println("添加用户失败，数组已满");
        return false;
    }


    /**
     * 如果找不到对应的用户，返回 null
     *
     * @param username
     * @return
     */
    @Override
    public User getByUsername(String username) {
        for (User user : arr) {
            // 遍历到的用户是null 并且用户名和传入的用户名相同
            if (user != null && user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }


    @Override
    public void list() {
        for (User user : arr) {
            if (user != null) {
                System.out.println(user);
            }
        }
    }
}
