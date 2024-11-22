package org.sp1k_e.leetCode.medium

import kotlin.test.Test
import kotlin.test.assertEquals

class FlipCols4MaximumEqualRowsTests {
    @Test
    fun test() {
        val testCases = arrayOf(
            FlipCols4MaximumEqualRowsTestCase(
                1, arrayOf(
                    intArrayOf(0, 1),
                    intArrayOf(1, 1),
                )
            ),
            FlipCols4MaximumEqualRowsTestCase(
                2, arrayOf(
                    intArrayOf(0, 1),
                    intArrayOf(1, 0),
                )
            ),
            FlipCols4MaximumEqualRowsTestCase(
                2, arrayOf(
                    intArrayOf(0, 0, 0),
                    intArrayOf(0, 0, 1),
                    intArrayOf(1, 1, 0),
                )
            ),
        )
        val testObject = FlipCols4MaximumEqualRows()
        for (testCase in testCases) {
            val result = testObject.maxEqualRowsAfterFlips(testCase.input)
            assertEquals(testCase.expected, result)
        }
    }
}

private data class FlipCols4MaximumEqualRowsTestCase(val expected: Int, val input: Array<IntArray>)