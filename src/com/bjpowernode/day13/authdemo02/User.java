package com.bjpowernode.day13.authdemo02;

public class User {

    private int a1 = 100;
    int a2 = 200;
    protected int a3 = 300;
    public int a4 = 400;


    public static void main(String[] args) {
        User c1 = new User();
        System.out.println(c1.a1);
        System.out.println(c1.a2);
        System.out.println(c1.a3);
        System.out.println(c1.a4);
    }
}
