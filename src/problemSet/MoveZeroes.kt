package problemSet

import utils.convertToIntArray
import utils.print

/**
 * 题库
 * 283. 移动零
 * Easy
 *
 * https://leetcode-cn.com/problems/move-zeroes/
 *
 * https://leetcode-cn.com/submissions/detail/124629842/
 * https://leetcode-cn.com/submissions/detail/124632380/
 *
 * 没看题解前思路被局限在换位上了，没有想到0可以后补
 * 耗时很大，重新根据题解的思路过一遍后快了10倍
 * Easy题太看思路，不能被局限了
 */
fun main() {
//    moveZeroes("[0,1,0,3,12]".convertToIntArray())
//    moveZeroes("[1,0]".convertToIntArray())
    moveZeroes("[4,2,4,0,0,3,0,5,1,0]".convertToIntArray())
    moveZeroes2("[4,2,4,0,0,3,0,5,1,0]".convertToIntArray())
}


/**
 * 耗时2564ms     6.43%
 * 内存36.7M      11.43%
 */
fun moveZeroes(nums: IntArray) {
    if (nums.size <= 1) {
        return
    }
    var markIndex = -1
    var currIndex = 0
    while (currIndex != nums.size - 1) {
        if (nums[currIndex] == 0) {
            if (nums[currIndex] == nums[currIndex + 1]) {
                if (markIndex == -1) {
                    markIndex = currIndex
                }
                currIndex++
                continue
            } else {
                val tempCurr = nums[currIndex]
                nums[currIndex] = nums[currIndex + 1]
                nums[currIndex + 1] = tempCurr
                if (markIndex != -1) {
                    currIndex = markIndex
                    markIndex = -1
                    continue
                }
            }
        }

        currIndex++
    }

    nums.print()//打印结果
}


/**
 * 耗时228ms      75.00%
 * 内存35.7M      51.43%
 */
fun moveZeroes2(nums: IntArray) {
    var j = 0 //当前已存储的有数值列表长度
    for (index in nums.indices) {
        if (nums[index] != 0) { //不为0时存储
            nums[j] = nums[index]
            j++
        }
    }
    for (i in j until nums.size) { //从已存储的长度开始，直到补满0
        nums[i] = 0
    }
    nums.print()//打印结果
}