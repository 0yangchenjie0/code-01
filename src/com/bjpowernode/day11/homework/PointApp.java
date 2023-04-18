package com.bjpowernode.day11.homework;

/**
 * 定义一个坐标类（Point)，用于表示二维空间中的一个坐标位置。通过坐标类的方法，实现计算两个坐标位置之间的距离（要求：使用构造方法）。
 * 坐标类成员变量：X轴点（x）、Y轴点（y）
 * 坐标类构造方法：Point(double x, double y)
 * 坐标类成员方法：计算两个坐标位置之间的距离（模拟）。

 */
public class PointApp {

    public static void main(String[] args) {
        double x = 2;
        double y = 3;
        Point point = new Point(x, y);
        double result = point.distance();
        System.out.println(result);
    }
}

class Point {

    double x;
    double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double distance() {

        return this.x * this.y;
    }

}
