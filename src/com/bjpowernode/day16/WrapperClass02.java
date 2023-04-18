package com.bjpowernode.day16;

/**
 * 包装类转换基本数据类型
 */
public class WrapperClass02 {

    public static void main(String[] args) {
        // 数值型包装对象转化为基本类型
        Double d1 = Double.valueOf(10.2);
        // 将d1转换成 int 类型

        int i1 = d1.intValue();
        float f1 = d1.floatValue();
        System.out.println(i1);
        System.out.println(f1);

        Boolean b1= Boolean.valueOf(true);
        boolean b2 = b1.booleanValue();

        Character c1 = Character.valueOf('a');
        char c2 = c1.charValue();

    }
}
