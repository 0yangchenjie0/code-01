package com.bjpowernode.day18;


public class ExceptionDemo03 {
    public static void main(String[] args) {
        // 运行期异常
        // int i = 100/0; // java.lang.ArithmeticException : / by zero

        // 空指针异常
        //int[] arr = null;
        // arr[0] = 100; // java.lang.NullPointerException
        // Object obj = null;
        // System.out.println(obj.hashCode()); // java.lang.NullPointerException

        // Animal ant = new Ant();
        // Ant ant1 = (Ant) ant;
        // 类型转换异常
        // Elephant elephant = (Elephant) ant; // ClassCastException

        Object obj = new Object();
        Ant ant = (Ant) obj;// // ClassCastException

    }
}

class Animal {

}

class Ant extends Animal {
    int a = 100;
}

class Elephant extends Animal {

}