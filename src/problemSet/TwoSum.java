package problemSet;

/**
 * 题库
 * 1.两数之和
 * Easy
 *
 * https://leetcode-cn.com/problems/two-sum/
 *
 * https://leetcode-cn.com/submissions/detail/27429482/
 */
public class TwoSum {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.twoSum(new int[]{1,3,5,7,9},10);
    }

    static class Solution {
        public int[] twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                int o = target - nums[i];
                for (int j = i+1; j < nums.length; j++) {
                    int otherNum = nums[j];
                    if (o == otherNum) {
                        return new int[]{i,j};
                    }
                }
            }
            return null;
        }
    }
}
