package org.sp1k_e.leetCode.medium

import kotlin.test.Test
import kotlin.test.assertEquals

class MaximumMatrixSumTests {
    @Test
    fun test() {
        val testCases = arrayOf(
            MaximumMatrixSumTestCase(4, arrayOf(intArrayOf(1, -1), intArrayOf(-1, 1))),
            MaximumMatrixSumTestCase(16, arrayOf(intArrayOf(1, 2, 3), intArrayOf(-1, -2, -3), intArrayOf(1, 2, 3))),
        )
        val testObject = MaximumMatrixSum()
        for (testCase in testCases) {
            val result = testObject.maxMatrixSum(testCase.input)
            assertEquals(testCase.expected, result)
        }
    }
}

private data class MaximumMatrixSumTestCase(val expected: Long, val input: Array<IntArray>)