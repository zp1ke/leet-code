package org.sp1k_e.leetCode.medium

import org.sp1k_e.leetCode.model.TreeNode

// https://leetcode.com/problems/pseudo-palindromic-paths-in-a-binary-tree/description/
class PseudoPalindromicPathsInBinaryTree {
    fun pseudoPalindromicPaths(root: TreeNode?): Int {
        return paths(root)
    }

    private fun paths(node: TreeNode?, odds: Set<Int> = emptySet()): Int {
        if (node == null) {
            return 0
        }

        val oddsSet = odds.toMutableSet()
        if (!oddsSet.add(node.`val`)) {
            oddsSet.remove(node.`val`)
        }

        if (node.left == null && node.right == null) {
            return if (oddsSet.size < 2) 1 else 0
        }

        return paths(node.left, oddsSet) + paths(node.right, oddsSet)
    }
}
