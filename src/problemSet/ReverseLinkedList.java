package problemSet;

import node.ListNode;

import static utils.format.convert2ListNode;
import static utils.print.print;
/**
 * 题库
 * 206. 反转链表
 * Easy
 *
 * https://leetcode-cn.com/problems/reverse-linked-list/
 *
 * https://leetcode-cn.com/submissions/detail/33013323/
 */
public class ReverseLinkedList {

    public static void main(String[] args) {
        new ReverseLinkedList(convert2ListNode("[1,2,3,4,5]"));
    }

    public ReverseLinkedList(ListNode head) {
        print(reverseList(head));
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;

        }
        return prev;
    }
}
