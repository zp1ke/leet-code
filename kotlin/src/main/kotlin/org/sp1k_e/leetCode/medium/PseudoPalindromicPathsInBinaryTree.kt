package org.sp1k_e.leetCode.medium

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
