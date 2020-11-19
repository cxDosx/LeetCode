package utils

fun main() {
    makeClassName("maximum-number-of-non-overlapping-subarrays-with-sum-equals-target")
}

/**
 * @param str 输入  类似于maximum-number-of-non-overlapping-subarrays-with-sum-equals-target
 * 输出在控制台  类似于MaximumNumberOfNonOverlappingSubarraysWithSumEqualsTarget
 */
fun makeClassName(str: String) {
    var nextUpper = true //改变默认值，控制首字母大写
    str.forEach {
        nextUpper = if (it == '-') {
            true
        } else {
            print(it - if (nextUpper) 32 else 0)
            false
        }
    }
}