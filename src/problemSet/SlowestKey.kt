package problemSet

import utils.convertToIntArray

/**
 * 题库
 * 1629. 按键持续时间最长的键
 * Easy
 *
 * https://leetcode-cn.com/problems/slowest-key/
 *
 * https://leetcode-cn.com/submissions/detail/123814778/
 */
fun main() {
    println(slowestKey("[12,23,36,46,62]".convertToIntArray(), "spuda"))
    println(slowestKey("[9,29,49,50]".convertToIntArray(), "cbcd"))
}

fun slowestKey(releaseTimes: IntArray, keysPressed: String): Char {
    val keysPressedChars = keysPressed.toCharArray()
    if (releaseTimes.size == 1) {
        return keysPressedChars[0]
    }
    var startTime = 0
    var longPressTime = 0
    var result = keysPressedChars[0]
    releaseTimes.forEachIndexed { index, value ->
        val pressTime = value - startTime
        if (pressTime == longPressTime) {
            if (keysPressedChars[index] > result) {
                result = keysPressedChars[index]
            }
        } else if (pressTime > longPressTime) {
            longPressTime = pressTime
            result = keysPressedChars[index]
        }
        startTime = value
    }
    return result
}