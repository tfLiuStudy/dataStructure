package com.recursion;

/**
 * 迷宫问题学习
 * 使用二维数组表示迷宫
 * 1：表示墙；
 * 2：表示通路；
 * 3：表示从路走过，但不能走通
 */
public class MiGong {

    /**
     * main函数
     * @param args
     */
    public static void main(String[] args) {
        int[][] map = createMap(7, 8);
        // 设置挡板
        setBarrier(map);
        // 地图展示
        showMap(map);
        // 进行迷宫回溯，查找小球的位置，小球的初始位置为【0，0】
        boolean result = seekBall(map,1, 1);
        if (!result){
            System.out.println("无有效路径");
        }
        showMap(map);
    }

    /**
     * 进行迷宫回溯
     * 回溯策略为：下 --》右 --》上 --》左 // 可设置多个策略进行比较（最优策略的话，路线最短）
     * 1：表示墙；
     * 2：表示通路；
     * 3：表示从路走过，但不能走通。
     * @param map 地图
     * @param i 目标球的横坐标
     * @param j 目标球的纵坐标
     * @return
     */
    private static boolean seekBall(int[][] map, int i, int j) {
        if (map[5][6] == 2){
            System.out.println("地图已经找到");
            return true;
        } else {
            // 小球还没有走过
            if (map[i][j] == 0){
                // 假定当前位置可通
                map[i][j] = 2;
                // 跟我回溯策略进行行走
                if (seekBall(map, i+1, j)){ // 下
                    return true;
                } else if (seekBall(map, i, j+1)){ // 右
                    return true;
                } else if (seekBall(map, i-1, j)){ // 上
                    return true;
                } else if (seekBall(map, i, j-1)){ // 左
                    return true;
                } else {
                    map[i][j] = 3;
                    return false;
                }
            } else {
                return false;
            }

        }
    }

    /**
     * 设置挡板
     * @param map
     */
    private static void setBarrier(int[][] map) {
        map[3][1] = 1;
        map[3][2] = 1;
    }

    /**
     * 二维数组展示
     * @param map
     */
    private static void showMap(int[][] map) {
        for (int[] row : map) {
            for (int column : row) {
                System.out.print(column + "\t");
            }
            System.out.println();
        }
    }

    /**
     * 创建地图
     * @param i  横向
     * @param j  纵向
     * 用1来表示迷宫的墙
     */
    public static int[][] createMap(int i, int j){
        // 使用二维数组表示
        int[][] map = new int[i][j];
        // 纵向
        for (int x=0; x<i; x++){
            map[x][0] = 1;
            map[x][j-1] = 1;
        }
        // 横向
        for (int y=0; y<j; y++){
            map[0][y] = 1;
            map[i-1][y] = 1;
        }
        return map;
    }
}
