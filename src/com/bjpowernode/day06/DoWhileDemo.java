package com.bjpowernode.day06;

/**
 * do {
 * // 循环代码
 * } while(条件表达式)
 * <p>
 * 无论while中的表达式是否成立，do中的语句都至少执行一次
 * 也就是说，第二次执行do语句之前，才去判断while中的表达式是否成立
 *
 * while 循环的区别，while循环先判断循环条件是否成立，成立，执行循环语句中的代码，不成立退出循环
 * do while 先执行一次do中的代码，再判断while循环条件是否成立，成立，再次执行do中的代码，不成立，退出循环
 */
public class DoWhileDemo {
    public static void main(String[] args) {

//        int i = 1;
//        do {
//            System.out.println(i);
//            i++;
//        } while (i <= 1);

        int j = 1;
        while (j < 1) {
            System.out.println(j);
            j--;
        }
    }
}
