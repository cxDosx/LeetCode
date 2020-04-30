package problemSet;

import java.util.Random;

/**
 * 题库
 * 202. 快乐数
 * Easy
 *
 * https://leetcode-cn.com/problems/happy-number/
 *
 * https://leetcode-cn.com/submissions/detail/67169388/
 *
 * 快慢指针，最后的值一定会有循环重复，快乐数一定为1
 * 参考解法
 * https://leetcode-cn.com/problems/happy-number/comments/58320
 */
public class HappyNumber {
    public static void main(String[] args) {
        HappyNumber happyNumber = new HappyNumber();
        for (int i = 0; i < 10; i++) {
            int r = new Random().nextInt(Integer.MAX_VALUE);
            System.out.println(r + "\t是否为快乐数：" + happyNumber.isHappy(r));
        }
    }

    public boolean isHappy(int n) {
        int fast = n;
        int slow = n;
        do {
            slow = measureNumberSum(slow);
            fast = measureNumberSum(fast);
            fast = measureNumberSum(fast);
        }while (fast != slow);
        return fast == 1;
    }

    private int measureNumberSum(int value) {
        int result = 0;
        while (value != 0) {
            int per = value % 10;
            value /= 10;
            result += per * per;
        }
        return result;
    }
}
