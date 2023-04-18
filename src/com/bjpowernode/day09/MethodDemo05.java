package com.bjpowernode.day09;

/**
 * 可变参数
 * 可变参数：适用于参数个数不确定，但类型确定的情况，java把可变参数当做数组处理。
 * 我们使用表示可变长参数，位于变量类型和变量名之间，前后有无空格都可以。
 * <p>
 * 思考:有可变参数的方法，能不能还有其它参数
 */
public class MethodDemo05 {
    public static void main(String[] args) {
        // System.out.println(sum()); // 0
        // System.out.println(sum(1,2));// 3
        test(100, 1, 2, 3);
    }

    static void test(int a, int... arr) {
        System.out.println(a);
        for (int value : arr) {
            System.out.println(value);
        }
    }


    /**
     * 可变参数会作为数组处理
     *
     * @param arr
     */
    static int sum(int... arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
