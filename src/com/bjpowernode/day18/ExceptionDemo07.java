package com.bjpowernode.day18;

public class ExceptionDemo07 {
    public static void main(String[] args) {
        try {
            m1(0);
        } catch (Exception e) {
            // e.printStackTrace();
            System.out.println(e.getMessage());
        }
        m2(); // 调用的方法声明的是运行期异常，调用方法的时候可以不处理
    }

    public static int m1(int i) throws Exception {
        if (i == 0) {
            // 抛出异常,如果抛出的是编译期异常。方法上必须声明该异常
            throw new Exception("参数i不能为0");
            // int a = 100; 错误 throw 语句后不能再有其它代码
        }
        int result = 100 / i;
        return result;
    }

    public static void m2() throws RuntimeException {
        // 抛出一个运行期异常,抛出运行期异常，方法上可以不声明该异常
        throw new RuntimeException();
    }
}
