package problemSet

import utils.convertToIntArray
import utils.print
import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap

/**
 * 题库
 * 1331. 数组序号转换
 * Easy
 *
 * https://leetcode-cn.com/problems/rank-transform-of-an-array/
 *
 * https://leetcode-cn.com/submissions/detail/123818950/
 */
fun main() {
    arrayRankTransform("[37,12,28,9,100,56,80,5,12]".convertToIntArray()).print()
}

fun arrayRankTransform(arr: IntArray): IntArray {
    val arrayInt = arr.toTypedArray()
    Arrays.sort(arrayInt)
    val hashMap = HashMap<Int, Int>()
    var duplicateCount = 0
    arrayInt.forEachIndexed { index, value ->
        if (hashMap.containsKey(value)) {
            duplicateCount++
            return@forEachIndexed
        }
        hashMap[value] = index + 1 - duplicateCount
    }
    val resultList = ArrayList<Int>()
    arr.forEach {
        resultList.add(hashMap.getOrDefault(it, 0))
    }
    return resultList.toIntArray()
}