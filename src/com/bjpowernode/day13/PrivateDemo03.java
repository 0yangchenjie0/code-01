package com.bjpowernode.day13;

public class PrivateDemo03 {
}

class P1 {
    private P1() {

    }
}

// 构造方法被 private 修饰，该类不能被继承，因为该类不能被其它类创建对象

//class P2 extends P1 {
//    P2() {
//        super();
//    }
//}
