package problemSet;

/**
 * 题库
 * 461.汉明距离
 * Easy
 *
 * https://leetcode-cn.com/problems/hamming-distance/
 *
 *https://leetcode-cn.com/submissions/detail/27575259/
 */
public class HammingDistance {
    public static void main(String[] args) {
        HammingDistance hammingDistance = new HammingDistance();
        System.out.println(hammingDistance.hammingDistance(1,9));
    }

    public int hammingDistance(int x, int y) {
        // 例    x = 1  二进制 0001
        //       y = 9  二进制 1001
        //  x^y  进行异或计算  二进制  1000
        //  最终使用Integer.bitCount计算  x^y二进制中包含的所有1 即两个数之间的汉明距离
        return Integer.bitCount(x^y);
    }
}
