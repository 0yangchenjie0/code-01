package com.bjpowernode.day09;

import com.bjpowernode.util.ArrayUtil;

/**
 * 需求：删除数组{5, 12, 90, 18, 77, 76, 45, 28, 59, 72}索引为2的元素，删除后：{5, 12, 18, 77, 76, 45, 28, 59, 72，0}。
 * <p>
 * 实现：把数组索引2以后的元素向前移动一位，最后把数组的最后一个元素的值设置为默认值（整数类型的默认值为0）。
 * 第一步：先找到要删除的元素的下标
 * 第二步：移动数组元素的位置，完成删除功能
 * <p>
 * 数组的特点：
 * 1.数据类型固定
 * 2.长度固定
 * 3.查询快，增删性能较差
 */
public class ArrayTest01 {
    public static void main(String[] args) {

//        int[] arr = {5, 12, 90, 18, 77, 76, 45, 28, 59, 72};

//        int value = 90;
//        int index = -1;
//        for (int i = 0; i < arr.length; i++) {
//            if (value == arr[i]) {
//                // 找到要删除的元素，将索引赋值给index
//                index = i;
//                break;
//            }
//        }

        // 获取要删除元素的索引
//        int index = ArrayUtil.getIndex(90, arr);
//        if (index >= 0) {
//            // 找到了需要删除的元素
//            for (int i = index; i < arr.length - 1; i++) {
//                arr[i] = arr[i + 1];
//            }
//            arr[arr.length - 1] = 0;
//        }

        int[] arr = {5, 12, 90, 18, 77, 76, 45, 28, 59, 72};
        ArrayUtil.removeElement(76, arr); // 引用数据类型作为方法的参数传递，形参的改变会影响实参
        ArrayUtil.print(arr);
    }
}
