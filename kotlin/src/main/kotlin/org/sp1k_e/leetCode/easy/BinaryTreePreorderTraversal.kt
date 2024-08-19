package org.sp1k_e.leetCode.easy

import org.sp1k_e.leetCode.model.TreeNode

// https://leetcode.com/problems/binary-tree-preorder-traversal/description/
class BinaryTreePreorderTraversal {
    fun preorderTraversal(root: TreeNode?): List<Int> {
        if (root == null) {
            return emptyList()
        }
        val list = mutableListOf<Int>()
        val queue = mutableListOf<TreeNode>()
        queue.add(root)
        while (queue.isNotEmpty()) {
            val node = queue.removeFirst()
            list.add(node.`val`)
            if (node.right != null) {
                queue.add(0, node.right!!)
            }
            if (node.left != null) {
                queue.add(0, node.left!!)
            }
        }
        return list
    }
}