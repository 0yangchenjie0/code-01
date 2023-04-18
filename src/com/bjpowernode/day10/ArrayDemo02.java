package com.bjpowernode.day10;

public class ArrayDemo02 {
    public static void main(String[] args) {
        int[][] arr = new int[2][6];

        // 给二维数组第一个元素赋值一个长度为4的一维数组
//         arr[0] = new int[]{1, 2, 3, 4};
//         arr[1] = new int[]{1, 2};

        arr[0] = new int[4];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[0][3] = 4;

        arr[1] = new int[2];
        arr[1][0] = 1;
        arr[1][1] = 2;


        for (int i=0;i<arr.length;i++) {
            for (int j=0;j<arr[i].length;j++) {
                System.out.print(arr[i][j] + "* ");
            }
            System.out.println();
        }

    }
}
