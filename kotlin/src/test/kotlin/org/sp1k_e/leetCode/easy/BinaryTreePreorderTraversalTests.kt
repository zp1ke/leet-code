package org.sp1k_e.leetCode.easy

import org.sp1k_e.leetCode.model.asTreeNode
import kotlin.test.Test
import kotlin.test.assertEquals

class BinaryTreePreorderTraversalTests {
    @Test
    fun test() {
        val testCases = arrayOf(
            BinaryTreePreorderTraversalTestCase(emptyList(), emptyArray()),
            BinaryTreePreorderTraversalTestCase(listOf(1), arrayOf(1)),
            BinaryTreePreorderTraversalTestCase(listOf(1, 2, 3), arrayOf(1, null, 2, null, null, 3)),
            BinaryTreePreorderTraversalTestCase(listOf(1, 2, 4, 5, 3, 6, 7), arrayOf(1, 2, 3, 4, 5, 6, 7)),
        )
        val testObject = BinaryTreePreorderTraversal()
        for (testCase in testCases) {
            val result = testObject.preorderTraversal(testCase.input.asTreeNode)
            assertEquals(testCase.expected, result)
        }
    }
}

private data class BinaryTreePreorderTraversalTestCase(val expected: List<Int>, val input: Array<Int?>)