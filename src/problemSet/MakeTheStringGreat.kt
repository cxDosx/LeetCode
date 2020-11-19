package problemSet

/**
 * 周赛201
 * 1544. 整理字符串
 * Easy
 *
 * https://leetcode-cn.com/contest/weekly-contest-201/
 * https://leetcode-cn.com/problems/make-the-string-great/
 *
 * https://leetcode-cn.com/submissions/detail/124644872/
 */
fun main() {
    println(makeGood("leEeetcode"))
    println(makeGood("abBAcC"))
    println(makeGood("Pp"))
    println(makeGood("s"))
}

fun makeGood(s: String): String {
    if (s.length == 1) {
        return s
    }
    var currIndex = 0
    val sb = StringBuffer(s)
    while (currIndex + 1 < sb.length) {
        val checkValue = (sb[currIndex].isUpperCase() && sb[currIndex + 1].isLowerCase()) || (sb[currIndex].isLowerCase() && sb[currIndex + 1].isUpperCase())
        if (checkValue) {
            if (sb[currIndex].toLowerCase() == sb[currIndex + 1].toLowerCase()) {
                sb.deleteCharAt(currIndex)
                sb.deleteCharAt(currIndex)
                currIndex = 0
                continue
            }
        }
        currIndex++
    }
    return sb.toString()
}