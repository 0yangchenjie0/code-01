package com.bjpowernode.day18;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * try {
 *     // 可能出现异常的代码
 *   } catch(异常类 e) {
 *     // 处理异常，出现异常了执行 catch 块中的代码
 *   } finally {
 *     // 无论是否出现异常，都执行，可以没有finally
 *   }
 */
public class ExceptionDemo06 {

    public static void main(String[] args)  {


        try {
            m1(); // 程序出现异常，异常后面的代码将不再执行
            System.out.println("m1 方法调用结束");
        } catch (ParseException e) { // 如果出现异常，jvm会创建一个ParseException的对象 e
            System.out.println(e.getMessage()); // Unparseable date: "aaaa"
            System.out.println(e.toString());
            // 方法内部会打印异常到控制台
            e.printStackTrace();
        } finally {
            // 程序无论是否出现异常，finally 中的代码都会执行
            System.out.println("main 运行结束");
        }

    }

    public static void m1() throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy");
        format.parse("aaaa");
    }
}
