package weeklyContest;

import java.util.*;

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
        String[] a = {"bob,55,173,barcelona","lee,113,952,zurich","maybe,115,1973,madrid","chalicefy,229,283,istanbul","bob,24,874,shanghai","alex,568,412,tokyo","alex,242,1710,milan","iris,722,879,shenzhen","chalicefy,281,1586,warsaw","maybe,246,778,bangkok","xnova,605,166,newdelhi","iris,631,991,hongkong","chalicefy,500,620,tokyo","chalicefy,380,428,istanbul","iris,905,180,barcelona","alex,810,732,shenzhen","iris,689,389,paris","xnova,475,298,singapore","lee,58,709,amsterdam","xnova,717,546,guangzhou","maybe,78,435,shenzhen","maybe,333,145,hongkong","lee,405,1230,hongkong","lee,456,1440,tokyo","chalicefy,286,1071,amsterdam","alex,55,271,shanghai","bob,91,273,warsaw","iris,195,1825,tokyo","maybe,639,417,madrid","maybe,305,882,chicago","lee,443,47,chicago","chalicefy,958,840,budapest","lee,162,1239,budapest","bob,701,505,montreal","alex,52,1575,munich","bob,533,1407,amsterdam","lee,621,491,tokyo","chalicefy,866,622,rome","alex,925,455,hongkong","lee,968,164,moscow","chalicefy,31,1119,newdelhi","iris,527,700,warsaw","bob,286,1694,dubai","maybe,903,29,barcelona","maybe,474,1606,prague","maybe,851,648,beijing","lee,48,655,chicago","maybe,378,25,toronto","lee,922,691,munich","maybe,411,903,taipei","lee,651,112,guangzhou","lee,664,506,dubai","chalicefy,704,924,milan","maybe,333,1264,budapest","chalicefy,587,1112,singapore","maybe,428,437,moscow","lee,721,366,newdelhi","iris,824,1962,beijing","chalicefy,834,489,istanbul","alex,639,1473,zurich","xnova,898,738,tokyo","chalicefy,585,1313,frankfurt","xnova,730,759,beijing","alex,69,892,montreal","lee,77,91,barcelona","lee,722,611,taipei","chalicefy,706,1982,jakarta","chalicefy,743,584,luxembourg","xnova,683,322,istanbul","chalicefy,60,861,prague","alex,366,871,shenzhen","chalicefy,77,870,shenzhen","iris,913,1501,warsaw","iris,846,1176,warsaw","bob,873,69,zurich","alex,601,181,chicago","chalicefy,118,145,hongkong","bob,879,982,montreal","lee,994,950,chicago","maybe,885,1900,shanghai","lee,717,1447,shanghai","chalicefy,71,434,istanbul","bob,870,968,toronto","maybe,718,51,beijing","alex,669,896,istanbul","chalicefy,639,506,rome","alex,594,934,frankfurt","maybe,3,89,jakarta","xnova,328,1710,rome","alex,611,571,chicago","chalicefy,31,458,montreal","iris,973,696,toronto","iris,863,148,rome","chalicefy,926,511,warsaw","alex,218,1411,zurich","chalicefy,544,1296,shenzhen","iris,27,23,montreal","chalicefy,295,263,prague","maybe,575,31,munich","alex,215,174,prague"};
        System.out.println(solution.invalidTransactions(a));

        System.out.println("[\"bob,24,874,shanghai\",\"chalicefy,31,1119,newdelhi\",\"chalicefy,31,458,montreal\",\"lee,48,655,chicago\",\"alex,52,1575,munich\",\"bob,55,173,barcelona\",\"alex,55,271,shanghai\",\"lee,58,709,amsterdam\",\"chalicefy,60,861,prague\",\"alex,69,892,montreal\",\"chalicefy,71,434,istanbul\",\"lee,77,91,barcelona\",\"chalicefy,77,870,shenzhen\",\"maybe,78,435,shenzhen\",\"bob,91,273,warsaw\",\"lee,113,952,zurich\",\"maybe,115,1973,madrid\",\"chalicefy,118,145,hongkong\",\"lee,162,1239,budapest\",\"iris,195,1825,tokyo\",\"alex,215,174,prague\",\"alex,218,1411,zurich\",\"chalicefy,229,283,istanbul\",\"alex,242,1710,milan\",\"maybe,246,778,bangkok\",\"chalicefy,281,1586,warsaw\",\"chalicefy,286,1071,amsterdam\",\"bob,286,1694,dubai\",\"chalicefy,295,263,prague\",\"maybe,305,882,chicago\",\"xnova,328,1710,rome\",\"maybe,333,145,hongkong\",\"maybe,333,1264,budapest\",\"maybe,378,25,toronto\",\"lee,405,1230,hongkong\",\"maybe,411,903,taipei\",\"maybe,428,437,moscow\",\"lee,443,47,chicago\",\"lee,456,1440,tokyo\",\"maybe,474,1606,prague\",\"chalicefy,500,620,tokyo\",\"bob,533,1407,amsterdam\",\"chalicefy,544,1296,shenzhen\",\"alex,568,412,tokyo\",\"chalicefy,585,1313,frankfurt\",\"chalicefy,587,1112,singapore\",\"alex,594,934,frankfurt\",\"alex,601,181,chicago\",\"alex,611,571,chicago\",\"lee,621,491,tokyo\",\"iris,631,991,hongkong\",\"alex,639,1473,zurich\",\"chalicefy,639,506,rome\",\"lee,651,112,guangzhou\",\"lee,664,506,dubai\",\"alex,669,896,istanbul\",\"xnova,683,322,istanbul\",\"iris,689,389,paris\",\"chalicefy,704,924,milan\",\"chalicefy,706,1982,jakarta\",\"xnova,717,546,guangzhou\",\"lee,717,1447,shanghai\",\"lee,721,366,newdelhi\",\"iris,722,879,shenzhen\",\"lee,722,611,taipei\",\"xnova,730,759,beijing\",\"chalicefy,743,584,luxembourg\",\"iris,824,1962,beijing\",\"chalicefy,834,489,istanbul\",\"iris,846,1176,warsaw\",\"maybe,851,648,beijing\",\"iris,863,148,rome\",\"chalicefy,866,622,rome\",\"bob,870,968,toronto\",\"bob,873,69,zurich\",\"bob,879,982,montreal\",\"maybe,885,1900,shanghai\",\"maybe,903,29,barcelona\",\"iris,905,180,barcelona\",\"iris,913,1501,warsaw\",\"lee,922,691,munich\",\"chalicefy,926,511,warsaw\",\"chalicefy,958,840,budapest\",\"lee,968,164,moscow\",\"iris,973,696,toronto\",\"lee,994,950,chicago\"]");
    }


    static class Solution {
        Set<String> result = new HashSet<>();
        private List<String> invalidTransactions(String[] transactions) {
            for (String tran : transactions){
                boolean invaild = false;
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

                for (String otherTran : transactions){
                    if (otherTran.equals(tran)){
                        continue;
                    }

                    String otherName,otherCity;
                    int otherTime,otherAmount;
                    String[] arrayOtherTran = otherTran.split(",");
                    otherName = arrayOtherTran[0];
                    otherTime = Integer.parseInt(arrayOtherTran[1]);
                    //otherAmount = Integer.parseInt(arrayOtherTran[2]);
                    otherCity = arrayOtherTran[3];

                    if (name.equals(otherName) && Math.abs((otherTime-time)) < 60 && !city.equals(otherCity)){
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
