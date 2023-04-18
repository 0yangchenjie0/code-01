package com.bjpowernode.day18;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 多个异常使用捕获又该如何处理呢？
 *     1. 多个异常分别处理。
 *     2. 多个异常一次捕获，多次处理。
 *     3. 多个异常一次捕获一次处理。
 */
public class ExceptionDemo08 {


    public static void main(String[] args) {

        // 多个异常一次捕获一次处理
        try {
            m1(100);
        } catch (Exception e) {

            e.printStackTrace();
        }

        // 多个异常分别处理
        try {
            m1(100);

        } catch (ClassNotFoundException e) {

            // 可以根据不同的异常类型做不同的处理
        } catch (FileNotFoundException e) {


        } catch (IOException e) {


        } catch (Exception e) {


        }


      //  多个异常分别处理
//        try {
//            int i1 = 100/0;
//        } catch (ArithmeticException e) {
//
//        }
//
//        try {
//            int i2 = 100/0;
//        } catch (ArithmeticException e) {
//
//        }
//
//
//        try {
//            int i3 = 100/0;
//        } catch (ArithmeticException e) {
//
//        }


    }


    /**
     * 一个方法可能抛出多个异常
     *
     * @param i
     */
    public static void m1(int i) throws ClassNotFoundException, FileNotFoundException, IOException, Exception {
        if (i == 1) {
            // 找不到类的异常
            throw new ClassNotFoundException();
        } else if (i == 2) {
            // IO流异常
            throw new FileNotFoundException();
        } else if (i == 3) {
            // 找不到文件
            throw new IOException();

        } else {
            throw new Exception();
        }
    }
}
