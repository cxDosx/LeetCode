package problemSet;

/**
 * 题库
 * 509. 斐波那契数
 * Easy
 *
 * https://leetcode-cn.com/problems/fibonacci-number/
 *
 * https://leetcode-cn.com/submissions/detail/31175927/
 */
public class FibonacciNumber {

    public static void main(String[] args) {
        new FibonacciNumber(28);
    }

    public FibonacciNumber(int N) {
        System.out.println(fib(N));
    }

    public int fib(int N){

        return f(N);
    }

    public int f(int N){
        if (N == 0) {
            return N;
        }
        if (N == 1 || N == 2) {
            return 1;
        }
        return f(N-1) + f (N-2);
    }
}
