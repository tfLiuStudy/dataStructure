package com.queue.arrAchIeve;

/**
 * 使用数组形式实现环形队列
 * 核心思路：
 *  rear: 队列尾
 *  frant: 队列头
 *  maxSize: 队列最大容量
 *  1、判定队列为空：rear = frant
 *  2、判定队列满：(rear +1）% maxSize = frant;
 *  3、判定队列有效元素数量（rear + maxSize - frant）% maxSize
 */
public class RingQueueByArray {

}
