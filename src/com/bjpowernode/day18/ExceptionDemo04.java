package com.bjpowernode.day18;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;

/**
 * 编译期异常
 */
public class ExceptionDemo04 {
    public static void main(String[] args) throws ParseException, IOException {
        // SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        // Date date = format.parse("aaaa"); // java.text.ParseException: Unparseable date: "aaaa"

        File file = new File("java\\123.html"); //
        file.createNewFile();// java.io.IOException: 系统找不到指定的路径。
    }


}
