package problemSet;

/**
 * 题库
 * 498.对角线遍历
 * medium
 *
 * https://leetcode-cn.com/problems/diagonal-traverse/
 *
 * https://leetcode-cn.com/submissions/detail/31139708/
 */

public class Diagonaltraverse {
    public static void main(String[] args) {

        int[] a = new int[] {1,2,3};
        int[] b = new int[] {4,5,6};
        int[] c = new int[] {7,8,9};
        int[][] aa = new int[][]{a,b,c};
        new Diagonaltraverse(aa);
    }


    private Diagonaltraverse(int[][] m) {
       int[] a = findDiagonalOrder(m);
        for (int value : a) {
            System.out.print(value + ",");
        }
    }

    private int[] findDiagonalOrder(int[][] matrix) {
        if (matrix == null || matrix.length <= 0 || matrix[0]==null || matrix[0].length<=0) {
            return new int[]{};
        }

        int[] result = new int[matrix.length * matrix[0].length];

        if (matrix[0].length == 1) {
            for (int i = 0; i < matrix.length; i++) {
                result[i] = matrix[i][0];
            }
            return result;
        }else{
            int temp = 0;// x+y
            int xl = 0;// x轴长度
            int yl = 0;// y轴长度
            int x = 0;
            int y = 0;
            boolean flag = false;
            int count = 0;// 计数
            yl = matrix.length;
            xl = matrix[0].length;
            while (count != result.length) {
                x = flag ? temp : 0;
                y = flag ? 0 : temp;
                do {
                    if (x >= xl || y >= yl) {
                        if (flag) {
                            x--;
                            y++;
                        }else{
                            x++;
                            y--;
                        }
                        continue;
                    }
                    if (x + y == temp) {
                        result[count] = matrix[y][x];
                        count++;
                    }
                    if (flag) {
                        x--;
                        y++;
                    }else{
                        x++;
                        y--;
                    }
                }while (flag ? x > -1 : y > -1);
                flag = !flag;
                temp++;
            }
            return result;
        }


    }
}
