package com.queue.linkAchieve.circleLink;

/**
 * 小孩实体类
 */
public class Body {
    /**
     * 编号
     */
    private int No;
    /**
     * 指针，下一位
     */
    private Body next;

    public Body(int no) {
        No = no;
    }

    public int getNo() {
        return No;
    }

    public void setNo(int no) {
        No = no;
    }

    public Body getNext() {
        return next;
    }

    public void setNext(Body next) {
        this.next = next;
    }
}
