package problemSet

/**
 * 题库
 * 1342. 将数字变成 0 的操作次数
 * Easy
 *
 * https://leetcode-cn.com/problems/number-of-steps-to-reduce-a-number-to-zero/
 *
 * https://leetcode-cn.com/submissions/detail/123821463/
 */
fun main() {
    println(numberOfSteps(8))
}

fun numberOfSteps(num: Int): Int {
    var step = 0
    var n = num
    while (n != 0) {
        step++
        if (n % 2 == 0) {
            n /= 2
        } else {
            n--
        }
    }
    return step
}