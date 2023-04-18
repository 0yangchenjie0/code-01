package com.bjpowernode.day17;

/**
 * 枚举是一种特殊的类
 */
public class EnumDemo01 {
    public static void main(String[] args) {
        System.out.println(GoodsStatus.Y.value);
        System.out.println(GoodsStatus.N.value);

//        switch (GoodsStatus.N) {
//            case Y:
//                System.out.println("上架");
//                break;
//            case N:
//                System.out.println("下架");
//                break;
//        }

//        switch (3) {
//            case 1:;
//            case 2:;
//            default:;
//        }
    }
}


/**
 * 枚举类描述商品状态
 * Y 上架
 * N 下架
 *
 * 加载枚举类的时候，会完成枚举项的初始化, 每个枚举项是该枚举类的一个实例（对象），该对象是 final static 的
 */
enum GoodsStatus {
    // 枚举的第一行必须是枚举项
    Y("上架"), N("下架");  // new Obj()

    // 无参构造默认是私有的
    private GoodsStatus() {
        System.out.println("...");
    }

    private GoodsStatus(String value) {
       this.value = value;
    }

    // 枚举中的成员变量
    public String value;
}

/*
class GoodsStatus extends java.lang.Enum {
  public static final GoodsStatus Y = new GoodsStatus("上架");
  public static final GoodsStatus N = new GoodsStatus("下架");

    // 无参构造默认是私有的
    private GoodsStatus() {
        System.out.println("...");
    }

    private GoodsStatus(String value) {
       this.value = value;
    }
    // 枚举中的成员变量
    public String value;
}

 */
