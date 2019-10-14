package problemSet;

/**
 * 题库
 * 136. 只出现一次的数字
 * Easy
 *
 * https://leetcode-cn.com/problems/single-number/
 *
 * https://leetcode-cn.com/submissions/detail/33009227/
 *
 * 其他数字都会固定出现2次，进行异或运算后始终等于0
 * 留下的那个数字只出现一次，无法抵消
 */
public class SingleNumber {

    public static void main(String[] args) {
        new SingleNumber(new int[]{1, 1, 2, 3, 2, 3, 4, 5, 6, 5, 6});
    }

    public SingleNumber(int[] nums) {
        System.out.println(singleNumber(nums));
    }

    public int singleNumber(int[] nums) {
        int a = 0;
        if (nums == null || nums.length < 1) {
            return a;
        }
        for (int n : nums){
            a ^= n;
        }
        return a;
    }
}
