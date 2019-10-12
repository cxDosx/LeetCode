package problemSet;
/**
 * 题库
 * 557. 反转字符串中的单词 III
 * Easy
 *
 * https://leetcode-cn.com/problems/reverse-words-in-a-string-iii/
 *
 * https://leetcode-cn.com/submissions/detail/32832412/
 */
public class ReverseWordsInAStringIII {

    public static void main(String[] args) {
        new ReverseWordsInAStringIII("Let's take LeetCode contest");
    }

    public ReverseWordsInAStringIII(String s) {
        System.out.println(reverseWords(s));
    }

    public String reverseWords(String s) {
        if (!s.contains(" ")){
            return new StringBuilder(s).reverse().toString();
        }
        StringBuilder result = new StringBuilder();
        for (String word : s.split(" ")){
            result.append(new StringBuilder(word).reverse().toString()).append(" ");
        }
        return result.toString().trim();
    }

}
