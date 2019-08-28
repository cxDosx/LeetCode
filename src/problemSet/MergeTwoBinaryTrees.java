package problemSet;


import node.TreeNode;

/**
 * 题库
 * 617.合并二叉树
 * Easy
 *
 * https://leetcode-cn.com/problems/merge-two-binary-trees/
 *
 *https://leetcode-cn.com/submissions/detail/27527681/
 */
public class MergeTwoBinaryTrees {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null || t2 == null) {
            return t1 == null ? t2:t1;
        }
        TreeNode result = new TreeNode(t1.val+t2.val);
        result.left = mergeTrees(t1.left,t2.left);
        result.right = mergeTrees(t1.right,t2.right);
        return result;
    }
}
