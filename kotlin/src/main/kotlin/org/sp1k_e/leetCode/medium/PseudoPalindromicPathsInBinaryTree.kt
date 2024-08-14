package org.sp1k_e.leetCode.medium

// https://leetcode.com/problems/pseudo-palindromic-paths-in-a-binary-tree/description/
class PseudoPalindromicPathsInBinaryTree {
    fun pseudoPalindromicPaths(root: TreeNode?): Int {
        return if (root != null) paths(root) else 0
    }

    private fun paths(root: TreeNode, odds: Set<Int> = emptySet()): Int {
        val oddsList = odds.toMutableSet()
        if (!oddsList.add(root.`val`)) {
            oddsList.remove(root.`val`)
        }
        if (root.left == null && root.right == null) {
            return if (oddsList.size <= 1) 1 else 0
        }
        val leftPaths = if (root.left != null) paths(root.left!!, oddsList) else 0
        val rightPaths = if (root.right != null) paths(root.right!!, oddsList) else 0
        return leftPaths + rightPaths
    }
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null

    companion object {
        fun create(index: Int, array: Array<Int?>): TreeNode? {
            if (index < array.size && array[index] != null) {
                val node = TreeNode(`val` = array[index]!!)
                node.left = create(2 * index + 1, array)
                node.right = create(2 * index + 2, array)
                return node
            }
            return null
        }
    }

    override fun toString(): String = "TreeNode(`val`=$`val`, left=${left?.`val`}, right=${right?.`val`})"
}
