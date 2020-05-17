package com.recursion;

/**
 * 问题描述：在8*8的棋盘上有8个皇后，任意两个皇后都不能同处同一列/同一行/同一斜线，共有多少中摆的方式
 * 思路分析：
 *      1、第一个皇后，放在第一行，第一列；
 *      2、第二个皇后，放在第二行，从第一列进行遍历，看是否满足要求（非同行/同列/同斜线）；
 *      3、依次行向后进行，只到最后一行，得到一个皇后解
 *      4、当得到第一个解时，回溯到上一个栈，直到得到所有第一行第一列的所有解
 *      5、第二个皇后，放在第一行，第二列，重复，1、2、3、4...
 *      6、依次递进
 */
public class EightQueens {
    /**
     * 棋盘大小
     */
    int num = 8;
    /**
     * 放置皇后的容器
     * 数组的位数表示行数，位数上的值表示列
     */
    int[] queen = new int[num];

    /**
     * main
     * @param args
     */
    public static void main(String[] args) {
        EightQueens que = new EightQueens();
        que.addQueen(0);
    }

    /**
     * 进行皇后的添加
     * @param n
     */
    private void addQueen(int n) {
        if(n == num-1){
            showQueen();
            return;
        }

        for (int i = 0; i < num; i++) {
            // 将当前皇后放入第一所在行第一列
            queen[n] = i;
            if(judge(n)){
                addQueen(n+1);
            }
        }
    }

    /**
     * 规则校验，同行，同列
     * @param n
     * @return
     */
    private boolean judge(int n){
        for (int i = 0; i < n; i++) {
            // 进行非同列判断
            // 非同一斜线判断 Math.abs(n-i) == Math.abs(queen[i] - queen[n]
            if(queen[i] == queen[n] || Math.abs(n-i) == Math.abs(queen[i] - queen[n])){
                return false;
            }
        }
        return true;
    }

    /**
     * 皇后的展示
     */
    private void showQueen() {
        for (int i : queen) {
            System.out.print(queen[i] + "\t");
        }
        System.out.println();
    }

}
