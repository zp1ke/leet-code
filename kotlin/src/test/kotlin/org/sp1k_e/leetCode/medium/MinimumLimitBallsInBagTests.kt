package org.sp1k_e.leetCode.medium

import kotlin.test.Test
import kotlin.test.assertEquals

class MinimumLimitBallsInBagTests {
    @Test
    fun test() {
        val testCases = arrayOf(
            MinimumLimitBallsInBagTestCase(3, intArrayOf(9), 2),
            MinimumLimitBallsInBagTestCase(2, intArrayOf(2, 4, 8, 2), 4),
        )
        val testObject = MinimumLimitBallsInBag()
        for (testCase in testCases) {
            val result = testObject.minimumSize(testCase.input, testCase.n)
            assertEquals(testCase.expected, result)
        }
    }
}

private data class MinimumLimitBallsInBagTestCase(
    val expected: Int,
    val input: IntArray,
    val n: Int
)