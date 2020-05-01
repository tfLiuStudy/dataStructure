package com.queue.linkAchieve;

/**
 * 存储水浒英雄的节点信息
 */
public class HeroNode {
    /**
     * 编号
     */
    public int no;
    /**
     * 姓名
     */
    public String name;
    /**
     * 小名
     */
    public String nickName;
    /**
     * 下一个节点信息
     */
    public HeroNode nextNode;

    /**
     * 构造方法
     * @param no
     * @param name
     * @param nickName
     */
    public HeroNode(int no, String name, String nickName) {
        this.no = no;
        this.name = name;
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                ", nextNode=" + nextNode +
                '}';
    }
}
