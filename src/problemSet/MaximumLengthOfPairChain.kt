package problemSet

/**
 * 题库
 * 646. 最长数对链
 * medium
 *
 * https://leetcode-cn.com/problems/maximum-length-of-pair-chain/
 *
 * https://leetcode-cn.com/submissions/detail/122104379/
 *
 * 贪心
 */

fun main() {
//    findLongestChain(arrayOf(arrayOf(1, 2).toIntArray(), arrayOf(2, 3).toIntArray(), arrayOf(3, 4).toIntArray()))
    //[[-6,9],[1,6],[8,10],[-1,4],[-6,-2],[-9,8],[-5,3],[0,3]]
//    val a1 = arrayOf(-6, 9).toIntArray()
//    val a2 = arrayOf(1, 6).toIntArray()
//    val a3 = arrayOf(8, 10).toIntArray()
//    val a4 = arrayOf(-1, 4).toIntArray()
//    val a5 = arrayOf(-6, -2).toIntArray()
//    val a6 = arrayOf(-9, 8).toIntArray()
//    val a7 = arrayOf(-5, 3).toIntArray()
//    val a8 = arrayOf(0, 3).toIntArray()
//    println("RESULT=" + findLongestChain(arrayOf(a1, a2, a3, a4, a5, a6, a7, a8))) // 3

    //[[-10,-8],[8,9],[-5,0],[6,10],[-6,-4],[1,7],[9,10],[-4,7]]
//    val a10 = arrayOf(-10, -8).toIntArray()
//    val a11 = arrayOf(8, 9).toIntArray()
//    val a12 = arrayOf(-5, 0).toIntArray()
//    val a13 = arrayOf(6, 10).toIntArray()
//    val a14 = arrayOf(-6, -4).toIntArray()
//    val a15 = arrayOf(1, 7).toIntArray()
//    val a16 = arrayOf(9, 10).toIntArray()
//    val a17 = arrayOf(-4, 7).toIntArray()
//    println("RESULT=" + findLongestChain(arrayOf(a10, a11, a12, a13, a14, a15, a16, a17))) // 4

//    [[-1,1],[-2,7],[-5,8],[-3,8],[1,3],[-2,9],[-5,2]]
    val a20 = arrayOf(-1, 1).toIntArray()
    val a21 = arrayOf(-2, 7).toIntArray()
    val a22 = arrayOf(-5, 8).toIntArray()
    val a23 = arrayOf(-3, 8).toIntArray()
    val a24 = arrayOf(1, 3).toIntArray()
    val a25 = arrayOf(-2, 9).toIntArray()
    val a26 = arrayOf(-5, 2).toIntArray()
    println("RESULT=" + findLongestChain(arrayOf(a20, a21, a22, a23, a24, a25, a26))) // 1
}

fun findLongestChain(pairs: Array<IntArray>): Int {
    if (pairs.size < 2) {
        return pairs.size
    }
    pairs.sortWith(compareBy { it[1] })
    pairs.forEach {
        println("${it[0]}, ${it[1]}")
    }
    var right = pairs[0][1]
    var result = 1
    pairs.forEach {
        if (it[0] > right) {
            result++
            right = it[1]
            return@forEach
        }
    }
    return result
}