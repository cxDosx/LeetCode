package problemSet

/**
 * 题库
 * 1288. 删除被覆盖区间
 * medium
 *
 * https://leetcode-cn.com/problems/remove-covered-intervals/
 *
 * https://leetcode-cn.com/submissions/detail/122038381/
 *
 * 好久没做算法题了，随便抽了道题用kotlin写，有点不习惯了
 */

fun main() {
//    val a1 = arrayOf(1, 4).toIntArray()
//    val a2 = arrayOf(3, 6).toIntArray()
//    val a3 = arrayOf(2, 8).toIntArray()
//
//    val array = arrayOf(a1, a2, a3)
//    println(removeCoveredIntervals(array))


//    val a6 = arrayOf(34335, 39239).toIntArray()
//    val a4 = arrayOf(15875, 91969).toIntArray()
//    val a5 = arrayOf(29673, 66453).toIntArray()
//    val a7 = arrayOf(53548, 69161).toIntArray()
//    val a8 = arrayOf(40618, 93111).toIntArray()
//
//    val array2 = arrayOf(a6, a4, a5, a7, a8)
//    println(removeCoveredIntervals(array2)) //2

//    val array3 = arrayOf(arrayOf(0, 10).toIntArray(), arrayOf(5, 12).toIntArray())
//    println(removeCoveredIntervals(array3))

    val a10 = arrayOf(66672, 75156).toIntArray()
    val a11 = arrayOf(59890, 65654).toIntArray()
    val a12 = arrayOf(92950, 95965).toIntArray()
    val a13 = arrayOf(9103, 31953).toIntArray()
    val a14 = arrayOf(54869, 69855).toIntArray()
    val a15 = arrayOf(33272, 92693).toIntArray()
    val a16 = arrayOf(52631, 65356).toIntArray()
    val a17 = arrayOf(43332, 89722).toIntArray()
    val a18 = arrayOf(4218, 57729).toIntArray()
    val a19 = arrayOf(20993, 92876).toIntArray()

    val array4 = arrayOf(a10, a11, a12, a13, a14, a15, a16, a17, a18, a19)
    println(removeCoveredIntervals(array4))//3
}

fun removeCoveredIntervals(intervals: Array<IntArray>): Int {
    var deleteCount = 0
    val hashSet = HashSet<IntArray>()
    intervals.forEachIndexed { firstIndex, first ->
        intervals.forEachIndexed second@{ secondIndex, second ->
            if (firstIndex == secondIndex) {
                return@second
            }
            if (first.contentEquals(second) && hashSet.contains(second)){
                deleteCount++
                return@second
            }
            if (second[0] >= first[0] && second[1] <= first[1]) {
                if (!hashSet.contains(second)){
                    hashSet.add(second)
                }
            }
        }
    }
    return intervals.size - deleteCount - hashSet.size
}