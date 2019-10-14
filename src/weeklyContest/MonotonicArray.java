package weeklyContest;

/**
 * 周赛100
 * 896. 单调数列
 * Easy
 *
 * https://leetcode-cn.com/contest/weekly-contest-100/problems/monotonic-array/
 *
 * https://leetcode-cn.com/submissions/detail/33005613/
 *
 */

public class MonotonicArray {

    public static void main(String[] args) {
        new MonotonicArray(new int[]{6,5,4,4});
        new MonotonicArray(new int[]{1,3,2});
    }

    public MonotonicArray(int[] A) {
        System.out.println(isMonotonic(A));
    }

    public boolean isMonotonic(int[] A) {
        if (A == null || A.length < 1) {
            return false;
        }
        if (A.length == 1) {
            return true;
        }
        boolean more = false;
        boolean init = false;
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] == A[i+1]){
                continue;
            }
            if (A[i] < A[i+1]){
                if (init && more) {
                    return false;
                }
                init = true;
                more = false;
            }else {
                if (init && !more) {
                    return false;
                }
                init = true;
                more = true;
            }
        }
        return true;
    }
}
