package com.bjpowernode.day15.homework.test02;

public class UserApp {
    public static void main(String[] args) {
        // 使用多态的语法
        // UserService service = new UserServiceArrayImpl();
        UserService service = new UserServiceListImpl();

//        UserService service1 = new UserService() {
//            @Override
//            public boolean add(User user) {
//                return false;
//            }
//
//            @Override
//            public User getByUsername(String username) {
//                return null;
//            }
//
//            @Override
//            public void list() {
//
//            }
//        };

        // 添加用户信息
        service.add(new User("jack","123","jike",19));
        service.add(new User("rose","123","jike",19));
//        User u1 = service.getByUsername("jack");
//        System.out.println(u1);
//        User u2 = service.getByUsername("rose");
//        System.out.println(u2);
//        User u3 = service.getByUsername("jim");
//        System.out.println(u3);
        service.list();
    }
}
