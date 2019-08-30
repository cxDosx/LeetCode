package problemSet;

import node.TreeNode;

/**
 * 题库
 * 104.二叉树的最大深度
 * Easy
 *
 * https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/submissions/
 *
 * https://leetcode-cn.com/submissions/detail/27690796/
 *
 * 扩展阅读知识：DFS 深度优先搜索
 */
public class MaximumDepthOfBinaryTree {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left,right) + 1;

    }
}
