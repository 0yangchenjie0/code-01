package com.bjpowernode.day15.demo08;

public class InnerClassDemo08 {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        InnerClass01 innerClass01 = outerClass.innerClass01;
    }
}


class OuterClass {
    InnerClass01 innerClass01;
    static InnerClass02 innerClass02;
}


class InnerClass01 {

}

class InnerClass02 {

}
