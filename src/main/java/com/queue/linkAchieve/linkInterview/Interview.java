package com.queue.linkAchieve.linkInterview;

import com.queue.linkAchieve.singleLink.HeroNode;
import org.junit.Test;

import java.util.Stack;

/**
 * 单链表常见面试题总结
 */
public class Interview {

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
     * 思路：遍历，头插
     * @param node
     * @return
     */
    public HeroNode getInvertLink(HeroNode node){
        // 判断是否需要反转
        if(node == null || node.nextNode == null){
            System.out.println("无需反转");
            return null;
        }
        // 头插反转
        HeroNode cur = node; // 头节点
        HeroNode revHead= new HeroNode(0,"", ""); // 反转的头节点
        HeroNode next = null; // 指向当前节点的下一个节点
        while (cur != null){
            next = cur.nextNode;
            cur.nextNode = revHead.nextNode;
            revHead.nextNode = cur;
            cur = next;
        }
        return revHead;
    }

    /**
     * 打印单链表
     * 思路分析：
     * 1、反转打印  参考getInvertLink
     * 2、利用"栈"，先进后出的原则
     */
    public void printReverseLink(HeroNode head){
        if (head.nextNode == null){
            System.out.println("空链");
            return;
        }
        Stack<HeroNode> stack = new Stack<HeroNode>();
        HeroNode temp = head;
        while (true){
            if(temp == null){
                break;
            }
            stack.push(temp);
            temp = temp.nextNode;
        }
        // 出栈
        while (stack.size()>0){
            System.out.println(stack.pop());
        }
    }

    /**
     * 先进后出
     */
    @Test
    public void testStack(){
        Stack<HeroNode> stack = new Stack<HeroNode>();
        HeroNode node1 = new HeroNode(1, "a", "aa");
        HeroNode node2 = new HeroNode(2, "b", "bb");
        stack.add(node1);
        stack.add(node2);
        System.out.println(stack.pop());
    }
}
