package weeklyContest;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 周赛151
 * 1169. 查询无效交易
 * Easy
 *
 * https://leetcode-cn.com/contest/weekly-contest-151/problems/invalid-transactions/
 */

public class InvalidTransactions {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] a = {"alice,20,800,mtv","alice,50,100,beijing"};
        System.out.println(solution.invalidTransactions(a));
    }


    static class Solution {
        List<String> result = new ArrayList<>();
        private List<String> invalidTransactions(String[] transactions) {
            for (int i = 0; i < transactions.length; i++) {
                String aa = transactions[i];
                String[] transA = aa.split(",");
                String nameA = transA[0];
                int timeA = Integer.parseInt(transA[1]);
                String cityA = transA[3];

                for (int j = 0; j < transactions.length; j++) {
                    if (i == j) {
                        continue;
                    }
                    String bb = transactions[j];
                    String[] transB = bb.split(",");
                    String nameB = transB[0];
                    int timeB = Integer.parseInt(transB[1]);
                    int amountB = Integer.parseInt(transB[2]);
                    String cityB = transB[3];
                    if (amountB > 1000) {
                        result.add(bb);
                        continue;
                    }
                    if (nameA.equals(nameB) && Math.abs(timeB-timeA)<60 && !cityA.equals(cityB)){
                        result.add(bb);
                    }
                }

            }
            return result;
        }
    }
}
