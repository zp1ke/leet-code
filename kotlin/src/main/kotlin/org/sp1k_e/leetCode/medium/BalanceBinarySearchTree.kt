package org.sp1k_e.leetCode.medium

import org.sp1k_e.leetCode.model.TreeNode

// https://leetcode.com/problems/balance-a-binary-search-tree/description/
class BalanceBinarySearchTree {
    fun balanceBST(root: TreeNode?): TreeNode? {
        val list = inOrder(root).sorted()
        return balanced(list, 0, list.lastIndex)
    }

    private fun balanced(list: List<Int>, l: Int, r: Int): TreeNode? {
        if (list.isEmpty() || l > r) {
            return null
        }
        val mid = (r - l) / 2 + l
        val node = TreeNode(list[mid])
        node.left = balanced(list, l, mid - 1)
        node.right = balanced(list, mid + 1, r)
        return node
    }

    private fun inOrder(root: TreeNode?): List<Int> {
        if (root == null) {
            return emptyList()
        }
        val list = mutableListOf<Int>()
        val queue = mutableListOf<TreeNode>()
        var node: TreeNode? = root
        while (node != null || queue.isNotEmpty()) {
            while (node != null) {
                queue.add(0, node)
                node = node.left
            }

            node = queue.removeFirst()
            list.add(node.`val`)

            node = node.right
        }
        return list
    }
}