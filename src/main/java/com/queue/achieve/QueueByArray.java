package com.queue.achieve;

/**
 * 使用数组的形式实现队列
 * 1-队列头
 * 2-队列尾
 * 3-队列容量
 * 缺陷：
 *     1、数组只能使用一次，不能达到复用的效果
 *     2、将这个数组使用算法改进成一个环形队列，取模%
 */
public class QueueByArray {

    /**
     * 队列头
     */
    private int front;
    /**
     * 队列尾
     */
    private int rear;
    /**
     * 最大容量
     */
    private int maxSize;
    /**
     * 实现队列的数组
     */
    private int[] arrayQueue;

    /**
     * 构造函数
     * @param maxSize
     */
    public QueueByArray(int maxSize){
        this.front = -1;
        this.rear = -1;
        this.maxSize = maxSize;
        this.arrayQueue = new int[maxSize];
    }

    /**
     * 判断队列是否已满
     */
    public boolean isFull(){
        return rear == maxSize-1;
    }

    /**
     * 队列是否为空
     */
    public boolean isEmpty(){
        return rear == front;
    }

    /**
     * 队列增加
     * @param value
     */
    public void addQueue(int value){
        if(isFull()){
            System.out.println("队列已满");
            return;
        }
        rear++;
        arrayQueue[rear] = value;
    }

    /**
     * 队列减少
     * @param value
     */
    public int putQueue(int value){
        if (isEmpty()){
            throw new RuntimeException("队列已空");
        }
        front++;
        return arrayQueue[front];
    }

    /**
     * 显示所有队列
     */
    public void showAllQueue(){
        if (isEmpty()){
            throw new RuntimeException("队列已空");
        }
        for (int queue : arrayQueue) {
            System.out.printf("%d\t", queue);
        }
    }

    /**
     * 显示队列的头数据，注意不是取出数据
     */
    public int getHeadData(){
        if (isEmpty()){
            throw new RuntimeException("队列已空");
        }
        return arrayQueue[front+1];
    }
}
