package utils;

import node.ListNode;
import node.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class print {

    /**
     * 输出打印列表
     * @param list 列表项
     */
    public static void print(List<?> list){
        if (list == null) {
            System.out.println("null");
            return;
        } else if (list.size() == 0) {
            System.out.println("[]");
            return;
        }
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i == list.size() - 1){
                System.out.println("]");
            }else{
                System.out.print(", ");
            }
        }
    }

    /**
     * 输出打印树节点
     * @param root 树
     */
    public static void print(TreeNode root){
        if (root == null) {
            System.out.println("[]");
        }

        StringBuilder output = new StringBuilder();
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
        while(!nodeQueue.isEmpty()) {
            TreeNode node = nodeQueue.remove();

            if (node == null) {
                output.append("null, ");
                continue;
            }

            output.append(node.val).append(", ");
            nodeQueue.add(node.left);
            nodeQueue.add(node.right);
        }
        System.out.println("[" + output.substring(0, output.length() - 2) + "]");
    }

    public static void print(ListNode node){
        if (node == null) {
            System.out.println("[]");
        }

        StringBuilder result = new StringBuilder();
        while (node != null) {
            result.append(node.val).append(", ");
            node = node.next;
        }
        System.out.println("[" + result.substring(0, result.length() - 2) + "]");
    }
}
