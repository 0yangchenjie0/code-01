package com.bjpowernode.day18;

public class CustomExceptionDemo01 {

    public static void main(String[] args) {
        // 捕获异常
        try {
            m1();
        } catch (CustomExecption e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }


    public static void m1() throws CustomExecption {
        // 抛出自定义编译期异常
        throw new CustomExecption("自定义编译期异常....");
    }

    public static void m2() {
        // 抛出自定义运行期异常 可以不处理
        throw new CustomRuntimeException();
    }
}

/**
 * 自定义一个编译期异常类
 */
class CustomExecption extends Exception {

    CustomExecption(String message) {
        //super();
        super(message);
    }

}

/**
 * 自定义运行期异常类
 */
class CustomRuntimeException extends RuntimeException {

}
