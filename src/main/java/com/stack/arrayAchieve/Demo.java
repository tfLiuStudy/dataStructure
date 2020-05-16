package com.stack.arrayAchieve;

import org.junit.Test;

import java.util.Scanner;

/**
 * 数组栈校验
 */
public class Demo {
    @Test
    public void test() throws Exception {
        StackByArray myStack = new StackByArray(5);
        myStack.push(3);
        myStack.push(2);
        myStack.pop();
        myStack.showStack();
    }
}
