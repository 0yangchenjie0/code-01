package com.bjpowernode.day18;

import java.io.IOException;
import java.text.ParseException;

/**
 * throws 后面可以跟一到多个异常类的名称，多个使用逗号分隔
 * 调用了有异常声明的方法
 * 1.如果方法声明是的编译期异常，调用该方法的时候，必须处理该异常
 * 2.如果方法声明的是运行期异常，调用该方法的时候，可以不处理异常
 * <p>
 * 处理异常：
 * 1.调用的方法也声明被调用的方法声明的异常
 * 2.使用try catch finally 语句来处理异常
 */
public class ExceptionDemo05 {

//    public static void main(String[] args) throws ParseException,IOException {
//        m1(); // 编译期异常必须处理
//        // m2();
//    }

    public static void main(String[] args) throws Exception {
        m3();
    }


    /**
     * 定义方法，声明两个编译期的异常
     *
     * @throws ParseException
     * @throws IOException
     */
    public static void m1() throws ParseException, IOException {

    }

    public static void m2() throws NullPointerException {

    }

    public static void m3() throws ParseException, IOException {
        m1();
    }
}
