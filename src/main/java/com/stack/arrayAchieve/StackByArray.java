package com.stack.arrayAchieve;

/**
 * 栈的数组实现
 */
public class StackByArray {
    /**
     * 构建容器数组
     */
    private int[] myStack;
    /**
     * 栈容量
     */
    private int maxSize;
    /**
     * 栈顶元素
     */
    private int top = -1;

    /**
     * 构造器
     * @param maxSize
     */
    public StackByArray(int maxSize) {
        this.maxSize = maxSize;
        this.myStack = new int[this.maxSize];
    }

    /**
     * 判断栈满
     */
    public boolean isFull(){
        return top == maxSize - 1;
    }

    /**
     * 判断栈空
     */
    public boolean isEmpty(){
        return top == -1;
    }

    /**
     * 入栈
     * @param value
     */
    public void push(int value)  {
        // 校验栈满
        if (isFull()){
            System.out.println("栈满");
            return;
        }
        // 入栈
        top++;
        myStack[top] = value;
        System.out.println("入栈成功");
    }

    /**
     * 出栈
     * @return
     */
    public int pop() throws Exception {
        if (isEmpty()){
            throw new Exception("栈空");
        }
        int value = myStack[top];
        top--;
        return value;
    }

    /**
     * 栈的结果显示
     */
    public void showStack(){
        // 空校验
        if (isEmpty()){
            System.out.println("数组为空");
        }
        for (int i=top; i>-1; i--) {
            System.out.println(myStack[i]);
        }
    }
}
