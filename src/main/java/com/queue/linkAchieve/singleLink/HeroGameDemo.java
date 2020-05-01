package com.queue.linkAchieve.singleLink;

/**
 * 水浒英雄排行榜测试
 */
public class HeroGameDemo {

    /**
     * 测试main
     * @param args
     */
    public static void main(String[] args) {
        // 英雄管理工具
        HeroUtilsBySingleLink singleLinkedList = new HeroUtilsBySingleLink();

        // 制造英雄
        HeroNode firstHero = new HeroNode(1, "宋江", "及时雨");
        HeroNode secondHero = new HeroNode(2, "林冲", "豹子头");
        HeroNode thirdHero = new HeroNode(2, "小灰灰", "灰灰");

        // 尾部添加
        singleLinkedList.addBottom(firstHero);
        singleLinkedList.addBottom(secondHero);
        singleLinkedList.updateHero(thirdHero);
        singleLinkedList.del(2);

//        singleLinkedList.del(3);
        singleLinkedList.showAllHero();
    }
}
