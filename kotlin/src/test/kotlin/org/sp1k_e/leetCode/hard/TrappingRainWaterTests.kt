package org.sp1k_e.leetCode.hard

import kotlin.test.Test
import kotlin.test.assertEquals

class TrappingRainWaterTests {
    @Test
    fun test() {
        val testCases = arrayOf(
            TrappingRainWaterTestCase(
                6,
                intArrayOf(0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1)
            ),
            TrappingRainWaterTestCase(
                9,
                intArrayOf(4, 2, 0, 3, 2, 5)
            ),
            TrappingRainWaterTestCase(
                9,
                intArrayOf(0, 2, 0, 3, 1, 0, 1, 3, 2, 1)
            ),
        )
        val testObject = TrappingRainWater()
        for (testCase in testCases) {
            val result = testObject.trap(testCase.input)
            assertEquals(testCase.expected, result)
        }
    }
}

private data class TrappingRainWaterTestCase(
    val expected: Int,
    val input: IntArray
)