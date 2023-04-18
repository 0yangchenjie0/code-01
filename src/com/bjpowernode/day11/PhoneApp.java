package com.bjpowernode.day11;

import java.util.Scanner;

public class PhoneApp {

    public static void main(String[] args) {
        Phone iphone = new Phone();
        // 给成员变量赋值
        iphone.brand = "苹果";
        iphone.kind = "iphone 15 plus";
        iphone.price = 999.9;
        iphone.stock = 80;
        // 要求：可以多次购买（最后实现）
        //1.打印商品的信息
        iphone.info();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("请输入购买商品的数量：");
            int num = scanner.nextInt(); // 购买商品的数量
            //2.检查库存是否充足
            if (iphone.checkStock(num)) {
                System.out.println("库存充足，可以购买");
                //3.付款并扣减库存
                iphone.pay(num);
                //4.输出剩余库存
                System.out.println("剩余库存：" + iphone.stock);
            } else {
                System.out.println("库存不足");
            }
        }

    }
}

/**
 * 1.定义一个手机类 Phone，该类有如下属性
 * - 品牌   brand
 * - 型号   kind
 * - 价格   price
 * - 库存   stock
 * 在类中定义四个方法
 * - 方法一：在控制台输出手机的产品信息
 * void info() {
 * <p>
 * }
 * - 方法二：根据购买数量获取手机的应付款金额
 * // num 购买数量
 * double getPayable(int num) {
 * <p>
 * }
 * - 方法三：检查库存是否充足
 * boolean checkStock(int num) {
 * <p>
 * }
 * <p>
 * - 方法四：付款
 * void pay(int num) {
 * // 1.获取购买商品的总价
 * // 2.打印 "付款成功，您购买了 * 台 xx 手机，共支付：xx 元"
 * // 3.扣减库存
 * }
 */
class Phone {
    // 品牌
    String brand;
    // 型号
    String kind;
    // 价格
    double price;
    // 库存
    int stock;

    // 类的成员方法中是可以访问类的成员变量的
    void info() {
        System.out.println("品牌：" + brand);
        System.out.println("型号：" + kind);
        System.out.println("价格：" + price);
        System.out.println("库存：" + stock);
    }

    // 根据购买数量获取手机的应付款金额
    double getPayable(int num) {
        return price * num;
    }

    // 检查库存是否充足 充足返回 true 不足返回false
    boolean checkStock(int num) {
        return (stock - num >= 0);
    }

    // 付款
    void pay(int num) {
        // 获取购买商品的总价
        double totalPrice = getPayable(num);
        // 扣减库存
        stock -= num;
        System.out.println("付款成功，您购买了" + num + "台" + brand + "手机，共支付：" + totalPrice + "元");
    }
}
