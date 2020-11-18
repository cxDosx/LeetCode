package problemSet

/**
 * 题库
 * 520. 检测大写字母
 * Easy
 *
 * https://leetcode-cn.com/problems/detect-capital/
 *
 * https://leetcode-cn.com/submissions/detail/124367936/
 */
fun main() {
//    println(detectCapitalUse("AZaz"))
//    println(detectCapitalUse("Flag"))
//    println(detectCapitalUse("Google"))
//    println(detectCapitalUse("BAIDU"))
//    println(detectCapitalUse("BuLL"))
//    println(detectCapitalUse("byte"))
    println(detectCapitalUse("mL"))
}

fun detectCapitalUse(word: String): Boolean {
    val wordChar = word.toCharArray()
    if (wordChar.size > 1) {
        val firstUpper = wordChar[0].isUpperCase()
        var allUpper = false
        for (index in 1 until wordChar.size) {
            if (wordChar[index].isUpperCase()) {
                if (index == 1) {
                    if (!firstUpper) {
                        return false
                    }
                    allUpper = true
                } else if (!allUpper) {
                    return false
                } else if (!firstUpper) {
                    return false
                }
            } else if (allUpper) {
                return false
            }
        }
    }
    return true
}