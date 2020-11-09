package problemSet;

/**
 * 周赛157
 * 1217. 玩筹码
 * Easy
 *
 * https://leetcode-cn.com/contest/weekly-contest-157/problems/play-with-chips/
 *
 * https://leetcode-cn.com/submissions/detail/32460887/
 *
 * 找到数组中的奇偶数，取其最小值
 */
public class PlayWithChips {

    public static void main(String[] args) {
        new PlayWithChips(new int[]{1, 2, 2, 2, 2});
    }

    public PlayWithChips(int[] chips) {
        System.out.println(minCostToMoveChips(chips));
    }

    public int minCostToMoveChips(int[] chips) {
        if (chips == null || chips.length < 1 || chips.length == 1) {
            return 0;
        }
        int len = chips.length;
        int EVEN = 0;
        for (int chip : chips) {
            if (chip % 2 == 0) {
                EVEN++;
            }
        }
        return Math.min(EVEN, len - EVEN);
    }

}
