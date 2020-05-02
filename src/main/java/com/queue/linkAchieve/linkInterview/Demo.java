package com.queue.linkAchieve.linkInterview;

import com.queue.linkAchieve.singleLink.HeroNode;
import com.queue.linkAchieve.singleLink.HeroUtilsBySingleLink;
import org.junit.Test;

/**
 * 链表面试题测试
 */
public class Demo {
    @Test
    public void testReverse() {
        Interview interview = new Interview();
        // 获取队列
        HeroNode link = this.getQueue();
//        HeroNode invertLink = interview.getInvertLink(link);
        interview.printReverseLink(link);
    }

    private HeroNode getQueue() {
        HeroNode firstHero = new HeroNode(1, "宋江", "及时雨");
        HeroNode secondHero = new HeroNode(2, "林冲", "豹子头");
        HeroNode thirdHero = new HeroNode(3, "小灰灰", "灰灰");
        firstHero.nextNode = secondHero;
        firstHero.nextNode.nextNode = thirdHero;
        return firstHero;
    }
}
