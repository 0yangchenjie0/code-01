package com.bjpowernode.day02;
/**
控制台输出商品的基本信息，不同商品使用 -- 分割
  品牌：华为
  型号：P40
  价格：2999.9
  销量：5000
  
  品牌：小米
  型号：Xiaomi13 Pro
  价格：5399.0
  销量：4000
*/
public class GoodsInfo {
   public static void main(String[] args) {
		String brand01 = "华为";
		String kind01 = "P40";
		double price01 = 2999.9;
		int sales01 = 5000;
		// 控制台输出商品的基本信息   + 字符串拼接
		System.out.println("品牌：" + brand01);
		System.out.println("型号：" + kind01);
		System.out.println("价格：" + price01);
		System.out.println("销量：" + sales01);
   }
}