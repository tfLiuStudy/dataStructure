package com.queue.linkAchieve;

/**
 * 使用链表的形式实现队列
 * 链表的特点：
 *  1、链表以节点的形式存储：节点类HeroNode
 *  2、每个节点的包含data域，和next域
 *  应用实例：水浒英雄排行榜
 *  1、添加英雄时，直接添加在底部
 *  2、添加英雄时，可添加到指定位置
 *  3、修改节点功能
 *      思路：找到该节点，进行遍历
 *  4、删除节点
 */
public class SingleLinkedList {

    /**
     * 初始化头节点信息
     */
    private HeroNode headNode;

    /**
     * 直接添加在底部
     * @param node
     */
    public void addBottom(HeroNode node){
        HeroNode temp = headNode;
        while (true){
            if (temp.nextNode == null){
                break;
            }
            temp = temp.nextNode;
        }
        temp.nextNode = node;
    }

    /**
     * 添加到指定位置
     */
    public void addHeroByPoint(HeroNode node){

    }
}
