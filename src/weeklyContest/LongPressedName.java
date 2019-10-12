package weeklyContest;

/**
 * 周赛107
 * 925. 长按键入
 * Easy
 *
 * https://leetcode-cn.com/contest/weekly-contest-107/problems/long-pressed-name/
 *
 * https://leetcode-cn.com/submissions/detail/32840732/
 */

public class LongPressedName {

    public static void main(String[] args) {
        new LongPressedName("leelee", "lleeelee");
    }

    public LongPressedName(String name, String typed) {
        System.out.println(isLongPressedName(name, typed));
    }

    public boolean isLongPressedName(String name, String typed) {
        if (name.length() < 1 || typed.length() < 1) {
            return false;
        }
        if (name.length() == 1) {
            return typed.contains(name);
        }
        int position = 0;
        for (int i = 0; i < name.length(); i++) {
            String tempWord;
            if (i + 2 <= name.length() - 1) {
                tempWord = name.substring(i, i+2);
            }else {
                tempWord = name.substring(i);
            }
            if (typed.contains(tempWord)) {
                int p = typed.indexOf(tempWord, position);
                if (p >= position) {
                    position = p;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }
        return true;
    }
}
