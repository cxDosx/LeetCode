package problemSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static utils.print.print;
/**
 * 周赛158
 * 5223. 可以攻击国王的皇后
 * medium
 *
 * https://leetcode-cn.com/contest/weekly-contest-158/problems/queens-that-can-attack-the-king/
 *
 * https://leetcode-cn.com/submissions/detail/32995704/
 *
 * 朝八个方向遍历至第一个女皇棋子或顶点
 */
public class QueensThatCanAttackTheKing {

    public static void main(String[] args) {
        new QueensThatCanAttackTheKing(new int[][]{{0,1},{1,0},{4,0},{0,4},{3,3},{2,4}},new int[]{0,0});
    }

    public QueensThatCanAttackTheKing(int[][] queens, int[] king) {
        print(queensAttacktheKing(queens, king));
    }

    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        List<List<Integer>> result = new ArrayList<>();
        int[][] direction = new int[][]{{0,-1},{0,1},{-1,0},{1,0},{1,1},{-1,-1},{1,-1},{-1,1}};
        if (queens == null || queens.length < 1 || king == null || king.length != 2) {
            return result;
        }
        boolean[][] flags = new boolean[8][8];
        for (int[] q : queens){
            flags[q[0]][q[1]] = true;
        }
        for (int[] dir : direction) {
            for (int x = king[0], y = king[1]; x >= 0 && x < 8 && y >= 0 && y < 8; x += dir[0], y += dir[1]) {
                if (flags[x][y]) {
                    result.add(Arrays.asList(x, y));
                    break;
                }
            }
        }
        return result;
    }
}
