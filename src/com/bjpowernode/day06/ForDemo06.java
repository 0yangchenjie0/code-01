package com.bjpowernode.day06;

/**
 * 输出1到100 之间既能被 5 整除又能被 3 整除的数，并且每行输出 5 个。
 * <p>
 * 1.输出1-100之间的整数
 * 2.输出1-100之间能被5和3都整除的数
 * 3.每行输出5个
 */
public class ForDemo06 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                count++;
                //System.out.println(i + "-->" + count);
                System.out.print(i + "\t");
                // 判断是否要换行输出
                if (count % 5 == 0) {
                    System.out.println();
                }
            }
        }
    }
}
