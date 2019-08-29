package problemSet;

import node.TreeNode;

/**
 * 题库
 * 226.翻转二叉树
 * Easy
 *
 * https://leetcode-cn.com/problems/invert-binary-tree/
 *
 * https://leetcode-cn.com/submissions/detail/27689692/
 */
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode leftTree = invertTree(root.left);
        TreeNode rightTree = invertTree(root.right);
        root.left = rightTree;
        root.right = leftTree;
        return root;
    }
}
