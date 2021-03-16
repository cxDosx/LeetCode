package problemSet

import utils.convertToInt2Array

/**
 * 题库
 * 54. 螺旋矩阵
 * medium
 *
 * https://leetcode-cn.com/problems/spiral-matrix/
 *
 * https://leetcode-cn.com/submissions/detail/155709159/
 *
 */

fun main() {
//    println(spiralOrder("[[1,2,3],[4,5,6],[7,8,9]]".convertToInt2Array()))
//    println(spiralOrder("[[1,2,3,4],[5,6,7,8],[9,10,11,12]]".convertToInt2Array()))
    println(spiralOrder("[[1,2,3,4],[5,6,7,8],[9,10,11,12],[13,14,15,16]]".convertToInt2Array()))
}

fun spiralOrder(matrix: Array<IntArray>): List<Int> {
    if (matrix.isEmpty() || matrix[0].isEmpty()) {
        return ArrayList()
    }
    val result = ArrayList<Int>()
    if (matrix[0].size == 1) {
        matrix.forEach {
            result.add(it[0])
        }
        return result
    }
    val hSize = matrix[0].size
    val vSize = matrix.size

    var rIndex = 0
    var lIndex = 0
    var tIndex = 0
    var bIndex = 0
    while (result.size < matrix.size * matrix[0].size) {
        for (index in lIndex until hSize - rIndex) {
            if (result.size >= matrix.size * matrix[0].size) {
                return result
            }
            result.add(matrix[tIndex][index])
        }
        tIndex++
        for (index in 0 + tIndex until matrix.size - bIndex) {
            if (result.size >= matrix.size * matrix[0].size) {
                return result
            }
            result.add(matrix[index][hSize - 1 - rIndex])
        }
        rIndex++
        for (index in hSize - rIndex - 1 downTo lIndex) {
            if (result.size >= matrix.size * matrix[0].size) {
                return result
            }
            result.add(matrix[vSize - bIndex - 1][index])
        }
        bIndex++
        for (index in vSize - bIndex - 1 downTo tIndex) {
            if (result.size >= matrix.size * matrix[0].size) {
                return result
            }
            result.add(matrix[index][lIndex])
        }
        lIndex++
    }
    return result
}