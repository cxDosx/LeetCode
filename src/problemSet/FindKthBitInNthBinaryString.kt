package problemSet

/**
 * 周赛201
 * 1545. 找出第 N 个二进制字符串中的第 K 位
 * medium
 *
 * https://leetcode-cn.com/contest/weekly-contest-201/
 * https://leetcode-cn.com/problems/find-kth-bit-in-nth-binary-string/
 *
 * Kotlin
 * https://leetcode-cn.com/submissions/detail/124650507/
 * 由于貌似没人用kotlin写这道题，所以又用Java写了一遍[FindKthBitInNthBinaryString]
 * Java
 * https://leetcode-cn.com/submissions/detail/124653203/
 */
fun main() {
    println(findKthBit(4, 11))
}

fun findKthBit(n: Int, k: Int): Char {
    return generateS(n)[k - 1]
}

fun generateS(n: Int): String {
    if (n == 1) {
        return "0"
    }
    val v = generateS(n - 1)
    return v.plus("1").plus(reverse(invert(v)))
}

fun reverse(str: String): String {
    return str.reversed()
}

fun invert(str: String): String {
    val stringBuilder = StringBuilder(str)
    stringBuilder.forEachIndexed { index, c ->
        stringBuilder[index] = if (c == '1') '0' else '1'
    }
    return stringBuilder.toString()
}