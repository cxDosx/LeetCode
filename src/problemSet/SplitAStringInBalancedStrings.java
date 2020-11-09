package problemSet;

/**
 * 周赛158
 * 5222. 分割平衡字符串
 * Easy
 *
 * https://leetcode-cn.com/contest/weekly-contest-158/problems/split-a-string-in-balanced-strings/
 *
 * https://leetcode-cn.com/submissions/detail/32984324/
 */

public class SplitAStringInBalancedStrings {

    public static void main(String[] args) {
        new SplitAStringInBalancedStrings("RLRRLLRLRL");
    }

    public SplitAStringInBalancedStrings(String s) {
        System.out.println(balancedStringSplit(s));
    }

    public int balancedStringSplit(String s) {
        int result = 0;
        int L = 0;
        int R = 0;
        for (char c : s.toCharArray()){
            if (c == 'L'){
                L++;
            }else{
                R++;
            }
            if (L != 0 && L == R){
                result ++;
                L = R = 0;
            }
        }
        return result;
    }
}
