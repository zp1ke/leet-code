package org.sp1k_e.leetCode.medium

import kotlin.test.Test
import kotlin.test.assertEquals

class PseudoPalindromicPathsInBinaryTreeTests {
    @Test
    fun test() {
        val testCases = arrayOf(
            PseudoPalindromicPathsInBinaryTreeTestCase(1, arrayOf(9)),
            PseudoPalindromicPathsInBinaryTreeTestCase(2, arrayOf(2, 3, 1, 3, 1, null, 1)),
            PseudoPalindromicPathsInBinaryTreeTestCase(1, arrayOf(2, 1, 1, 1, 3, null, null, null, null, null, 1)),
        )
        val testObject = PseudoPalindromicPathsInBinaryTree()
        for (testCase in testCases) {
            val result = testObject.pseudoPalindromicPaths(testCase.treeNode)
            assertEquals(testCase.expected, result)
        }
    }
}

private data class PseudoPalindromicPathsInBinaryTreeTestCase(val expected: Int, val input: Array<Int?>) {
    val treeNode: TreeNode?
        get() {
            // TODO
            return null
        }
}