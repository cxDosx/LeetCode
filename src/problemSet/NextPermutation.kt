package problemSet

import java.util.*

/**
 * 题库
 * 31. 下一个排列
 * medium
 *
 * https://leetcode-cn.com/problems/next-permutation/
 *
 * https://leetcode-cn.com/submissions/detail/122430038/
 *
 */

fun main() {
//    nextPermutation(arrayOf(1, 2, 3).toIntArray())
//    nextPermutation(arrayOf(1, 1, 5).toIntArray())
//    nextPermutation(arrayOf(7, 9, 8).toIntArray())
//    nextPermutation(arrayOf(1,2).toIntArray())
//    nextPermutation(arrayOf(3, 0, 2).toIntArray())
//    nextPermutation(arrayOf(2, 3, 1).toIntArray())
    nextPermutation(arrayOf(5, 4, 7, 5, 3, 2).toIntArray())

}


fun nextPermutation(nums: IntArray) {
    if (nums.size > 2) {
        var tempMax = nums[0]
        var isMaxFlag = true
        for (index in 1 until nums.size) {
            if (tempMax < nums[index]) {
                isMaxFlag = false
            } else {
                tempMax = nums[index]
            }
        }

        if (isMaxFlag) {
            Arrays.sort(nums)
        } else {
            var replaceIndex = -1

            var step = nums.size - 2
            while (step != -1) {
                if (step <= replaceIndex) {
                    break
                }
                //取出首位
                var pickFirstValue = nums[step]
                //循环遍历首位后的数，从最后一位起
                for (index in nums.size - 1 downTo step + 1) {
                    val pickValue = nums[index] // 取出的数
                    if (replaceIndex != -1) {
                        //已替换首位
                        if (pickFirstValue > pickValue) {
                            nums[step] = pickValue
                            nums[index] = pickFirstValue
                            pickFirstValue = nums[step]
                        }
                    } else {
                        //没替换首位
                        if (pickFirstValue < pickValue) {
                            nums[step] = pickValue
                            nums[index] = pickFirstValue
                            replaceIndex = step
                            step = nums.size - 1 //因为后面多减了一次
                            break
                        }
                    }
                }

                step--
            }

        }
    } else if (nums.size == 2) {
        if (nums[1] > nums[0]) {
            val v = nums[0]
            nums[0] = nums[1]
            nums[1] = v
        }
    }
//
    print("Out=[")
    nums.forEachIndexed { index, it ->
        print("$it")
        if (index != nums.size - 1) {
            print(",")
        }
    }
    println("]")
}