package problemSet;

/**
 * 题库
 * 541. 反转字符串 II
 * Easy
 *
 * https://leetcode-cn.com/problems/reverse-string-ii/
 *
 * https://leetcode-cn.com/submissions/detail/32828427/
 *
 * 为了2ms的耗时牺牲了很多空间，这种写法不值得~~
 */

public class ReverseStringII {

    public static void main(String[] args) {
        new ReverseStringII("abcdefg", 3);
    }

    public ReverseStringII(String s, int k) {
        System.out.println(reverseStr(s, k));
    }

    public String reverseStr(String s, int k) {
        boolean reverser = true;
        String result = "";
        while (s.length() > result.length()) {
            int len = result.length();
            String substring = "";
            boolean lengthCheck = s.length() - len < k;
            if (!lengthCheck) {
                substring = s.substring(len, len + k);
            }
            if (reverser) {
                reverser = false;
                if (lengthCheck){
                    if (len == 0) {
                        result += new StringBuilder(s).reverse().toString();
                    }else{
                        result += new StringBuilder(s.substring(len)).reverse().toString();
                    }
                }else{
                    result += new StringBuilder(substring).reverse().toString();
                }
            }else{
                reverser = true;
                if (lengthCheck){
                    result += s.substring(len);
                }else{
                    result += substring;
                }
            }
        }
        return result;
    }
}
