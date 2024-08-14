package org.sp1k_e.leetCode.medium

import kotlin.test.Test
import kotlin.test.assertEquals

class PseudoPalindromicPathsInBinaryTreeTests {
    @Test
    fun test() {
        val testCases = arrayOf(
            PseudoPalindromicPathsInBinaryTreeTestCase(2, arrayOf(2, 3, 1, 3, 1, null, 1)),
            PseudoPalindromicPathsInBinaryTreeTestCase(1, arrayOf(2, 1, 1, 1, 3, null, null, null, null, null, 1)),
            PseudoPalindromicPathsInBinaryTreeTestCase(1, arrayOf(9)),
            PseudoPalindromicPathsInBinaryTreeTestCase(1, arrayOf(9,5,4,5,null,2,6,2,5,null,8,3,9,2,3,1,1,null,4,5,4,2,2,6,4,null,null,1,7,null,5,4,7,null,null,7,null,1,5,6,1,null,null,null,null,9,2,null,9,7,2,1,null,null,null,6,null,null,null,null,null,null,null,null,null,5,null,null,3,null,null,null,8,null,1,null,null,8,null,null,null,null,2,null,8,7)),
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
            if (input.isEmpty()) {
                return null
            }
            return TreeNode.create(0, input)
        }
}