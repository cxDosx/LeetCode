package problemSet;

import static utils.print.print;

/**
 * 题库
 * 66. 加一
 * Easy
 *
 * https://leetcode-cn.com/problems/plus-one/
 *
 * https://leetcode-cn.com/submissions/detail/33028069/
 */

public class PlusOne {

    public static void main(String[] args) {
        new PlusOne(new int[]{9,8,7,6,5});
        new PlusOne(new int[]{2, 0, 9, 9});
        new PlusOne(new int[]{9, 9});
        new PlusOne(new int[]{9});
        new PlusOne(new int[]{1, 2, 3, 4});
    }

    public PlusOne(int[] digits) {
        print(plusOne(digits));
    }

    public int[] plusOne(int[] digits) {
        if (digits == null || digits.length < 1) {
            return new int[]{};
        }
        int[] result;
        int len = digits.length;
        int offset = 0;
        if (digits[0] == 9 && digits[len - 1] == 9) {
            result = new int[len + 1];
            result[0] = 1;
            offset = 1;
        } else if (digits[len - 1] != 9){
            digits[len - 1] ++;
            return digits;
        }else{
            result = new int[len];
        }
        boolean plus = true;
        for (int i = len - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                if (plus) {
                    result[i + offset] = 0;
                }else {
                    result[i + offset] = digits[i];
                }
            } else if (plus) {
                plus = false;
                result[i + offset] = digits[i] + 1;
            }else{
                result[i + offset] = digits[i];
            }
        }
        return result;
    }
}
