package problemSet;

/**
 * 题库
 * LCP 1. 猜数字
 * Easy
 *
 * https://leetcode-cn.com/problems/guess-numbers/
 *
 * https://leetcode-cn.com/submissions/detail/33106796/
 */

public class GuessNumbers {

    public static void main(String[] args) {

    }

    public GuessNumbers(int[] guess, int[] answer) {
        System.out.println(game(guess, answer));
    }

    public int game(int[] guess, int[] answer) {
        int count = 0;
        for (int i = 0; i < guess.length; i++) {
            if (guess[i] == answer[i]){
                count++;
            }
        }
        return count;
    }
}
