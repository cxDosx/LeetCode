package problemSet;

/**
 * 题库
 * 11. 盛最多水的容器
 * medium
 *
 * https://leetcode-cn.com/problems/container-with-most-water/
 *
 * https://leetcode-cn.com/submissions/detail/31268634/
 */
public class ContainerWithMostWater {

    public static void main(String[] args) {
        new ContainerWithMostWater(new int[]{1,8,6,2,5,4,8,3,7});
    }

    public ContainerWithMostWater(int[] height) {
        System.out.println(maxArea(height));
    }

    // 双指针法
    public int maxArea(int[] height) {
        if (height.length == 2) {
            return Math.min(height[0],height[1]);
        }
        int result = 0;
        int left = 0; // 左指针
        int right = height.length - 1; // 右指针
        int L = height.length - 1;
        do {
            int leftNum = height[left];
            int rightNum = height[right];
            int T = Math.min(leftNum,rightNum) * L;
            if (T > result) {
                result = T;
            }
            if (leftNum > rightNum) {
                right--;
            }else{
                left++;
            }
            L--;
        }while (left != right);

        return result;
    }
}
