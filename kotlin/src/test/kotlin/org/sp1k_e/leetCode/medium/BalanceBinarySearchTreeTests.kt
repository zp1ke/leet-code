package org.sp1k_e.leetCode.medium

import org.sp1k_e.leetCode.model.asTreeNode
import kotlin.test.Test
import kotlin.test.assertEquals

class BalanceBinarySearchTreeTests {
    @Test
    fun test() {
        val testCases = arrayOf(
            BalanceBinarySearchTreeTestCase(arrayOf(2, 1, 3), arrayOf(2, 1, 3)),
            BalanceBinarySearchTreeTestCase(arrayOf(4, 2, 6, 1, 3, 5, 7), arrayOf(4, 2, 6, 1, 3, 5, 7)),
            BalanceBinarySearchTreeTestCase(
                arrayOf(2, 1, 3, null, null, null, 4),
                arrayOf(1, null, 2, null, 3, null, 4, null, null)
            ),
        )
        val testObject = BalanceBinarySearchTree()
        for (testCase in testCases) {
            val result = testObject.balanceBST(testCase.input.asTreeNode)
            assertEquals(testCase.expected.asTreeNode, result)
        }
    }
}

private data class BalanceBinarySearchTreeTestCase(val expected: Array<Int?>, val input: Array<Int?>)