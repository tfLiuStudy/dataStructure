package com.queue.linkAchieve.circleLink;

/**
 * 构建单向环形链表学习
 * 设编号为1,2,3...n的n个人围坐一圈，约定编号为k（1<=k<=n）的人从1开始报数，
 * 数到m的那个人出列，他的下一位又从1开始报数，数到m的那个人又出列依次类推，直到所有人出列为止。
 * 由此产生一个出队编号的顺序
 */
public class SingleCircleLink {

    /**
     * 第一个节点
     */
    private Body first;

    /**
     * 添加小孩
     * @param num
     */
    public void addBody(int num) {
        if (num < 1){
            System.out.println("num录入无效");
            return;
        }
        // 辅助变量
        Body curBody = null;
        // 构向
        for (int i=1; i<=num; i++){
            Body body = new Body(i);
            if (i == 1){
                first = body;
                first.setNext(first);
                curBody = first;
            } else {
                curBody.setNext(body);
                body.setNext(first);
                curBody = body;
            }
        }
    }

    /**
     * 展示队列成员
     */
    public void showBody(){
        // 队列为空判断
        if (first.getNext() == null){
            System.out.println("队列为空");
            return;
        }
        Body curBody = first;
        // 遍历展示队列成员
        while (true){
            System.out.println(curBody.getNo());
            if (curBody.getNext() == first){
                break;
            }
            curBody = curBody.getNext();
        }
    }
}
