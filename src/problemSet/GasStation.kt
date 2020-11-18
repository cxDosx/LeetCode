package problemSet

import utils.convertToIntArray

/**
 * 题库
 * 134. 加油站
 * medium
 *
 * https://leetcode-cn.com/problems/gas-station/
 *
 * https://leetcode-cn.com/submissions/detail/124352108/
 *
 * 每日一题
 */

fun main() {
    println(canCompleteCircuit("[1,2,3,4,5]".convertToIntArray(), "[3,4,5,1,2]".convertToIntArray()))
    println(canCompleteCircuit("[2,3,4]".convertToIntArray(), "[3,4,3]".convertToIntArray()))
}

fun canCompleteCircuit(gas: IntArray, cost: IntArray): Int {
    gas.forEachIndexed { index, gasValue ->
        if (gasValue < cost[index]) {
            return@forEachIndexed // 起始点的油不足以前往下一个地点，直接略过
        }
        var gasRemaining = gasValue //获得出发站的油
        var nextIndex = index
        do {
            gasRemaining -= cost[nextIndex] // 要走到下一个油站，先扣除当前油站消耗数
            if (gasRemaining < 0) { //不够油，跳出
                break
            }
            nextIndex++ //已走到下一站
            if (nextIndex == gas.size) {
                nextIndex = 0
            }
            gasRemaining += gas[nextIndex] //补充当前站点油量
        } while (nextIndex != index)

        if (gasRemaining > 0) {
            return index
        }
    }
    return -1
}