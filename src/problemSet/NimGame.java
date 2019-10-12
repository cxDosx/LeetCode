package problemSet;

/**
 * 题库
 * 292. Nim 游戏
 * Easy
 *
 * https://leetcode-cn.com/problems/nim-game/
 *
 * https://leetcode-cn.com/submissions/detail/32818208/
 *
 *
 * 巴什博弈
 * 一堆物品有n个，两人轮流拿，最少拿一个，最多拿m个，最后拿光者胜
 * 先手，每次取到物品数量为 m + 1 个则必胜
 * 若最后拿光者输，则后手胜
 * https://baike.baidu.com/item/%E5%B7%B4%E4%BB%80%E5%8D%9A%E5%BC%88
 */

public class NimGame {

    public static void main(String[] args) {
        new NimGame(3);
        new NimGame(4); // 必输
        new NimGame(5);
        new NimGame(6);
    }

    public NimGame(int n) {
        System.out.println(canWinNim(n));
    }

    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }
}
