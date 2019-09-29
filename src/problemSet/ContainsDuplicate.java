package problemSet;

import java.util.Arrays;

/**
 * 题库
 * 217. 存在重复元素
 * Easy
 *
 * https://leetcode-cn.com/problems/contains-duplicate/
 *
 * https://leetcode-cn.com/submissions/detail/31262692/
 */

public class ContainsDuplicate {

    public static void main(String[] args) {

    }


    public ContainsDuplicate(int[] nums) {
        System.out.println(containsDuplicate(nums));
    }

    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length < 2) {
            return false;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) {
                break;
            }
            if (nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }
}
