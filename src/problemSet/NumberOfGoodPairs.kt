package problemSet

/**
 * 周赛107
 * 1512. 好数对的数目
 * Easy
 *
 * https://leetcode-cn.com/contest/weekly-contest-197/
 * https://leetcode-cn.com/problems/number-of-good-pairs/
 *
 * https://leetcode-cn.com/submissions/detail/122044716/
 *
 * 简单暴力解
 */

fun main() {
    println(numIdenticalPairs(intArrayOf(1, 2, 3, 1, 1, 3)))
}

fun numIdenticalPairs(nums: IntArray): Int {
    var result = 0
    nums.forEachIndexed { i, element ->
        for (j in i + 1 until nums.size) {
            if (element == nums[j]) {
                result++
            }
        }
    }
    return result
}