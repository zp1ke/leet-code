package org.sp1k_e.leetCode.medium

import kotlin.test.Test
import kotlin.test.assertEquals

class MaximumNumberIntegersChooseFromRangeITests {
    @Test
    fun test() {
        val testCases = arrayOf(
            MaximumNumberIntegersChooseFromRangeITestCase(2, intArrayOf(1, 6, 5), 5, 6),
            MaximumNumberIntegersChooseFromRangeITestCase(0, (1..7).toList().toIntArray(), 8, 1),
            MaximumNumberIntegersChooseFromRangeITestCase(7, intArrayOf(11), 7, 50),
        )
        val testObject = MaximumNumberIntegersChooseFromRangeI()
        for (testCase in testCases) {
            val result = testObject.maxCount(testCase.input, testCase.n, testCase.maxSum)
            assertEquals(testCase.expected, result)
        }
    }
}

private data class MaximumNumberIntegersChooseFromRangeITestCase(
    val expected: Int,
    val input: IntArray,
    val n: Int,
    val maxSum: Int
)