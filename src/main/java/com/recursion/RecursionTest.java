package com.recursion;

public class RecursionTest {
    public static void main(String[] args) {
        // 打印问题
        test(3);
        // 阶乘问题
        System.out.println(factorial(5));
    }

    /**
     * 阶乘问题
     * @param i
     */
    private static int factorial(int i) {
        if(i != 1){
            return i * factorial(i-1);
        } else {
            return 1;
        }
    }

    /**
     * 打印问题
     * @param i
     */
    private static void test(int i) {
        if (i > 2){
            test(i-1 );
        }
        System.out.println("i=" + i);
    }
}
