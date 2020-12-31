package easy;

import java.util.Stack;

/**
 * 155. 最小栈
 * 设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。
 *
 * push(x) —— 将元素 x 推入栈中。
 * pop() —— 删除栈顶的元素。
 * top() —— 获取栈顶元素。
 * getMin() —— 检索栈中的最小元素。
 */
public class Q0155_MinStack {

    //请注意，这个题目需要先沟通，允许使用的数据结构都有哪些？亦或者只允许使用数组，这种情况会比较困难
    public Stack<Integer> minStack;
    public Stack<Integer> stack;
    /** initialize your data structure here. */
    public Q0155_MinStack() {
        minStack = new Stack<Integer>();
        stack = new Stack<Integer>();
    }

    public void push(int x) {
        stack.push(x);
        if(minStack.empty() || minStack.peek()>=x){
            minStack.push(x);
        }
    }

    public void pop() {
        //如果被移除是小数栈的栈顶元素,小数栈也需要移除
        if(stack.pop().equals(minStack.peek())){
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

}
