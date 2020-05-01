package com.queue.linkAchieve.singleLink;

/**
 * 使用链表的形式实现队列
 * 链表的特点：
 *  1、链表以节点的形式存储：节点类HeroNode
 *  2、每个节点的包含data域，和next域
 *  应用实例：水浒英雄排行榜
 *  1、添加英雄时，直接添加在底部
 *  2、添加英雄时，可添加到指定位置
 *  3、修改节点功能
 *  4、删除节点
 */
public class HeroUtilsBySingleLink {

    /**
     * 初始化头节点信息
     */
    private HeroNode headNode = new HeroNode(0,null, null);

    /**
     * 直接添加在底部
     * @param node
     */
    public void addBottom(HeroNode node){
        HeroNode temp = headNode;
        while (true){
            // 判定当前节点是否为尾部节点
            if (temp.nextNode == null){
                break;
            }
            temp = temp.nextNode;
        }
        temp.nextNode = node;
    }

    /**
     * 根据排名添加英雄
     */
    public void addHeroByPoint(HeroNode node){
        HeroNode temp = headNode;
        Boolean is_exist = false;
        while (true){
            // 判定当前节点是否为尾部节点
            if (temp.nextNode == null){
                break;
            }
            // 找到正确排名位置
            if(temp.no > node.no){
                break;
            } else if (temp.no == node.no){
                // 当前英雄已经存在
                is_exist = true;
                break;
            }
            temp = temp.nextNode;
        }
        if(is_exist){
            System.out.printf("准备插入的英雄编号 %d已经存在了，不能加入\n", node.no);
        } else {
            node.nextNode = temp.nextNode;
            temp.nextNode = node;
        }
    }

    /**
     * 修改节点功能
     * @param node
     */
    public void updateHero(HeroNode node){
        if(headNode.nextNode == null){
            System.out.println("链表为空！");
        }
        HeroNode temp = headNode.nextNode;
        Boolean is_update = false;

        while (true){
            //无该英雄
            if (temp == null || temp.no > node.no){
                break;
            }
            // 进行信息替换
            if (temp.no == node.no){
                is_update = true;
                break;
            }
            temp = temp.nextNode;
        }

        if (is_update){
            temp.name = node.name;
            temp.nickName = node.nickName;
        } else {
            System.out.printf("链表中未找到编号为：%s的患者", node.no);
        }
    }

    /**
     * 删除指定编号的英雄
     * @param no
     */
    public void del(int no){
        if (headNode.nextNode == null){
            System.out.println("链表为空");
        }
        HeroNode node = headNode.nextNode;
        HeroNode last = headNode;
        boolean is_del = false;
        while (true){
            if (node.no == no){
                is_del = true;
                break;
            }
            if (node.nextNode == null){
                break;
            }
            last =node;
            node = node.nextNode;
        }
        // 删除指定编号的英雄
        if (is_del){
            last.nextNode = node.nextNode;
        } else {
            System.out.println("未找到指定编号的英雄");
        }
    }

    /**
     * 展示所有英雄
     * return 和 break的区别
     */
    public void showAllHero(){
        if (headNode.nextNode == null){
            System.out.println("链表为空");
            return;
        }
        HeroNode node = headNode.nextNode;
        while (true){
            if (node == null){
                break;
            }
            System.out.println(node);
            node = node.nextNode;
        }
    }
}
