package com.array;

/**
 * 二维数组和稀疏数组相互转化学习
 * @Auther tfliu
 */
public class ArrayTransform {
    /**
     * 二维数组和稀疏数组之间的相互转化
     * @param args
     * @tfliu
     */
    public static void main(String[] args) {
        int[][] twoArray = new int[11][11];
        twoArray[1][2] = 1;
        twoArray[2][3] = 2;
        // 原始的二维数组
        System.out.println("原始的二维数组");
        printArray(twoArray);
        // 二维数组转稀疏数组
        int[][] sparseArray = twoToSparse(twoArray);
        // 稀疏数组转二维数组
        sparseToTwo(sparseArray);
    }

    /**
     * 二维数组转稀疏数组
     * 稀疏数组：把具有不同值元素的行列和值，记录在一个小规模数组中，从而缩小程序规模。
     * 每一行可分为三列
     * 第一行[行数][列数][值数量]
     * 后续行[行号][列号][值]
     * ...
     * 核心思路：
     * 1、遍历具体的二维数组，得到行数，列数，值数量
     * 2、稀疏数组的具体存值，将不等于0的数依次存入稀疏数组
     * @param twoArray
     * @return
     * @tfliu
     */
    private static int[][] twoToSparse(int[][] twoArray) {
        // 获取值数量
        int value = 0;
        for (int[] row : twoArray) {
            for (int column : row) {
                if(column != 0){
                    value ++;
                }
            }
        }
        // 稀疏数组存储
        int[][] sparseArray = new int[value+1][3];
        sparseArray[0][0] = twoArray.length;
        sparseArray[0][1] = twoArray[0].length;
        sparseArray[0][2] = value;
        int count = 0;
        for (int i=0;i<twoArray.length; i++){
            for (int j=0; j<twoArray[0].length; j++){
                if(twoArray[i][j] != 0){
                    count++;
                    sparseArray[count][0] = i; // 行
                    sparseArray[count][1] = j; // 列
                    sparseArray[count][2] = twoArray[i][j]; // 值
                }
            }
        }

        System.out.println("稀疏数组的输出");
        printArray(sparseArray);
        return sparseArray;
    }

    /**
     * 稀疏数组转二维数组
     * 基本思路：
     * 1、根据稀疏数组创建新的二维数组
     * 2、二维数组进行值存储
     * @param sparseArray
     * @tfliu
     */
    private static void sparseToTwo(int[][] sparseArray) {
        int[][] twoArray = new int[sparseArray[0][0]][sparseArray[0][1]];
        // 二维数组值存储
        for (int i=1; i<sparseArray.length; i++){
            int row = sparseArray[i][0];
            int column = sparseArray[i][1];
            int value = sparseArray[i][2];
            twoArray[row][column] = value;
        }
        System.out.println("新的二维数组输出");
        printArray(twoArray);
    }

    /**
     * 二维数组输出
     * @tfliu
     */
    private static void printArray(int[][] twoArray) {
        for (int[] row : twoArray) {
            for (int column : row) {
                System.out.printf("%d\t",column);
            }
            System.out.println();
        }
    }
}
