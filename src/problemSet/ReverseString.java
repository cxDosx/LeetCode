package problemSet;

/**
 * 题库
 * 344. 反转字符串
 * Easy
 *
 * https://leetcode-cn.com/problems/reverse-string/
 *
 * https://leetcode-cn.com/submissions/detail/32821080/
 */

public class ReverseString {

    public static void main(String[] args) {
        new ReverseString(new char[]{'h', 'e', 'l', 'l', 'o'});
    }

    public ReverseString(char[] s) {
        reverseString(s);
    }

    public void reverseString(char[] s) {
        for (int i = 0; i < s.length; i++) {
            int right = s.length - (i + 1);
            if (right <= i) {
                break;
            }

            char t = s[right]; // right

            s[right] = s[i];
            s[i] = t;
        }

        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]);
        }
    }

}
