package weeklyContest;

import java.util.*;

/**
 * 周赛151
 * 1169. 查询无效交易
 * Easy
 *
 * https://leetcode-cn.com/contest/weekly-contest-151/problems/invalid-transactions/
 *
 * https://leetcode-cn.com/submissions/detail/27413098/
 */

public class InvalidTransactions {
    static class Solution {
        Set<String> result = new HashSet<>();
        private List<String> invalidTransactions(String[] transactions) {
            for (int i = 0; i < transactions.length;i++){
                boolean invaild = false;
                String tran = transactions[i];
                String name,city;
                int time,amount;
                String[] arrayTran = tran.split(",");
                name = arrayTran[0];
                time = Integer.parseInt(arrayTran[1]);
                amount = Integer.parseInt(arrayTran[2]);
                city = arrayTran[3];
                if (amount > 1000) {
                    invaild = true;
                }

                for (int j = 0; j < transactions.length;j++){
                    if (invaild) {
                        break;
                    }
                    String otherTran = transactions[j];
                    if (i == j){
                        continue;
                    }

                    String otherName,otherCity;
                    int otherTime,otherAmount;
                    String[] arrayOtherTran = otherTran.split(",");
                    otherName = arrayOtherTran[0];
                    otherTime = Integer.parseInt(arrayOtherTran[1]);
                    //otherAmount = Integer.parseInt(arrayOtherTran[2]);
                    otherCity = arrayOtherTran[3];
                    if (name.equals(otherName) && Math.abs((otherTime-time)) <= 60 && !city.equals(otherCity)){
                        invaild = true;
                    }
                }

                if (invaild){
                    result.add(tran);
                }
            }

            return new ArrayList<>(result);
        }
    }
}
