package problemSet

import node.ListNode
import utils.convertToListNode
import utils.print

/**
 * 题库
 * 147. 对链表进行插入排序
 * Medium
 *
 * https://leetcode-cn.com/problems/insertion-sort-list/
 *
 * https://leetcode-cn.com/submissions/detail/124879550/
 */
fun main() {
    insertionSortList("[4,2,1,3]".convertToListNode()).print()
    insertionSortList("[-1,5,3,4,0]".convertToListNode()).print()
}

/**
 * 因为不是原地，所以用list取巧了
 * 这种算法效率较低，但是解题速度很快
 */
fun insertionSortList(head: ListNode?): ListNode? {
    if (head == null) {
        return head
    }
    val arrayList = ArrayList<Int>()
    var next = head
    while (next != null) {
        arrayList.add(next.`val`)
        next = next.next
    }
    val result = ListNode(0)
    if (arrayList.size > 0) {
        arrayList.sort()
        var rNext = result
        arrayList.forEach {
            rNext.next = ListNode(it)
            rNext = rNext.next
        }
    }
    return result.next
}