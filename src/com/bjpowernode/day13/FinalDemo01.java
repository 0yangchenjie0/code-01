package com.bjpowernode.day13;

public class FinalDemo01 {
    public static void main(String[] args) {
        G2 g = new G2();
        g.m1();
    }
}

final class E1 {

}

// 被final 修饰的类不能被其它类继承
//class E2 extends E1 {
//
//}

class G1 {
    final void m1() {
        System.out.println("hello");
    }
}

class G2 extends G1 {

    /* 错误
     被 final 修饰的方法不能被子类重写
    @Override
    void m1() {
        super.m1();
    }*/
}
