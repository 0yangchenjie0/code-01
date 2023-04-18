package com.bjpowernode.day18;
public class ExceptionDemo10 {
    public static void main(String[] args) {
        try {
            // .......
            int i = 100 / 0;
            System.out.println(i);
        } catch (NullPointerException e) {

        } catch (ArrayIndexOutOfBoundsException e) {

        } catch (ArithmeticException e) {

        }

        // jdk8 的新语法,和上面等价

        try {
            // ...
            int i = 100 / 0;
            System.out.println(i);
        } catch (NullPointerException | ArrayIndexOutOfBoundsException | ArithmeticException e) {

        }
    }
}
