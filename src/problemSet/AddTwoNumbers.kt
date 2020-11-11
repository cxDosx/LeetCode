package problemSet

import node.ListNode
import utils.format

/**
 * 题库
 * 2. 两数相加
 * Medium
 *
 * https://leetcode-cn.com/problems/add-two-numbers/
 *
 * https://leetcode-cn.com/submissions/detail/122590709/
 */

fun main() {
//    val l1 = format.convert2ListNode("[2,4,4]")
//    val l2 = format.convert2ListNode("[5,6,4]")
//    utils.print.print(addTwoNumbers(l1, l2))
    val l3 = format.convert2ListNode("[9,9,9,9,9,9,9]")
    val l4 = format.convert2ListNode("[9,9,9,9]")
    utils.print.print(addTwoNumbers(l3, l4))
}

fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    val resultList = ArrayList<Int>()
    var l1NextNode = l1
    var l2NextNode = l2
    var overAdd = 0
    while (l1NextNode != null || l2NextNode != null) {
        var value = (l1NextNode?.`val` ?: 0) + (l2NextNode?.`val` ?: 0) + overAdd
        overAdd = 0
        if (value >= 10) {
            value %= 10
            overAdd = 1
        }
        resultList.add(value)
        l1NextNode = l1NextNode?.next
        l2NextNode = l2NextNode?.next
    }
    if (overAdd != 0) {
        resultList.add(overAdd)
    }
    if (resultList.isNotEmpty()) {
        val resultNode = ListNode(0)
        var nextNode = resultNode
        for (element in resultList) {
            nextNode.next = ListNode(element)
            nextNode = nextNode.next
        }
        return resultNode.next
    }
    return null
}