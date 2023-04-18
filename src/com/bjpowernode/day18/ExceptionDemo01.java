package com.bjpowernode.day18;

public class ExceptionDemo01 {

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        getValue(arr,100); // ArrayIndexOutOfBoundsException
    }

    /**
     * 通过索引获取该索引对应元素的内容
     * @param arr
     * @param index  -100
     * @return
     */
    public static int getValue(int[] arr, int index) {

//        // 索引为负数的时候
//        if(index < 0) {
//            System.out.println("索引不能为负数！！");
//            return ？？; // 此处该返回什么呢？
//        }
//
//        // 索引大于等于数组长度的时候
//        if(index >= arr.length) {
//            System.out.println("索引不能大于等于数组长度！！");
//            return ???; // 此处该返回什么呢？
//        }
        // 正常返回元素值
        return arr[index];
    }
}
