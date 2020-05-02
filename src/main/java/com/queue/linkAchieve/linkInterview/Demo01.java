package com.queue.linkAchieve.linkInterview;

import com.queue.linkAchieve.singleLink.HeroNode;
import com.sun.org.apache.regexp.internal.RE;

/**
 * 单链表常见面试题总结
 */
public class Demo01 {

    /**
     * 单链表的有效节点个数
     */
    public static int getInvalidNum(HeroNode head){
        int length = 0;
        // 空链
        if (head.nextNode == null){
            return length;
        }
        // 遍历，求链表有效个数
        HeroNode node = head;
        while(node.nextNode != null){
            length++;
            node = node.nextNode;
        }
        return length;
    }

    /**
     * 查找单链表中倒数第K个节点
     * 思路分析：
     * 1、遍历，求链表有效个数
     * 2、顺序次数 = 总数 - K
     * 3、顺序遍历输出
     * @param k
     * @return
     */
    public HeroNode getInvertNode(HeroNode head, int k){
        if (head.nextNode == null){
            System.out.println("链表为空");
            return null;
        }
        // 遍历获取链表长度
        int length = 0;
        HeroNode temp1 = head;
        while (true){
            if (temp1.nextNode == null){
                break;
            }
            temp1 = temp1.nextNode;
            length++;
        }
        // 遍历获取获取倒数第k个节点
        int kNode = length - k;
        if (kNode < 0){
            System.out.println("倒数无第K个节点");
            return null;
        }
        HeroNode temp2 = head;
        int count = 0;
        while (true){
            if (count == kNode){
                return temp2;
            }
            count++;
            temp2 = temp2.nextNode;
        }
    }

    /**
     * 单链表反转
     * @param node
     * @return
     */
    public HeroNode getInvertLink(HeroNode node){
        return null;
    }
}
