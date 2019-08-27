package weeklyContest;

/**
 * 周赛151
 * 1170. 比较字符串最小字母出现频次
 * Easy
 *
 * https://leetcode-cn.com/contest/weekly-contest-151/problems/compare-strings-by-frequency-of-the-smallest-character/
 *
 * https://leetcode-cn.com/submissions/detail/27425197/
 */

public class CompareStringsbyFrequencyoftheSmallestCharacter {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.numSmallerByFrequency(new String[]{"bba","abaaaaaa","aaaaaa","bbabbabaab","aba","aa","baab","bbbbbb","aab","bbabbaabb"}
        ,new String[]{"aaabbb","aab","babbab","babbbb","b","bbbbbbbbab","a","bbbbbbbbbb","baaabbaab","aa"});
    }

    static class Solution {
        private int[] numSmallerByFrequency(String[] queries, String[] words) {
            int[] result = new int[queries.length];
            for (int i = 0; i < queries.length; i++) {
                int c = 0;
                for (int j = 0; j < words.length; j++) {
                    if (f(queries[i]) > words.length) {
                        continue;
                    }
                    if (f(queries[i]) < f(words[j])){
                        c++;
                    }
                }
                result[i] = c;
            }
            return result;
        }


        private int f (String s){
            char w = s.charAt(0);
            int count = 0;
            for (int i = 0; i < s.length();i++){
                char current = s.charAt(i);
                if (current < w){
                    w = current;
                    count = 0;
                }
                if (current == w) {
                    count++;
                }
            }
            return count;
        }
    }
}
