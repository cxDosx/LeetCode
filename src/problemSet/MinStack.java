package problemSet;

import java.util.Stack;
/**
 * 题库
 * 155. 最小栈
 * Easy
 *
 * https://leetcode-cn.com/problems/min-stack/
 *
 * https://leetcode-cn.com/submissions/detail/32456701/
 *
 * 通过牺牲空间，每一个数字将压入两次栈内，栈顶永远为最小值
 */
public class MinStack {

    private Stack<Integer> stack;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int x) {
        if (stack.isEmpty()) {
            stack.push(x);
            stack.push(x);
        }else{
            int tempMin = stack.peek();
            stack.push(x);
            stack.push(Math.min(tempMin, x));
        }
    }

    public void pop() {
        stack.pop();
        stack.pop();
    }

    public int top() {
        return stack.get(stack.size()-2);
    }

    public int getMin() {
        return stack.peek();
    }
}
