package org.sp1k_e.leetCode.medium

import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class MaxWaterContainerTests {
    @Test
    fun test() {
        val testCases = arrayOf(
            MaxWaterContainerTestCase(
                36,
                input = intArrayOf(1, 7, 2, 5, 4, 7, 3, 6),
            ),
            MaxWaterContainerTestCase(
                49,
                input = intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7),
            ),
            MaxWaterContainerTestCase(
                4,
                input = intArrayOf(2, 2, 2),
            ),
            MaxWaterContainerTestCase(
                1,
                input = intArrayOf(1, 1),
            ),
        )
        val testObject = MaxWaterContainer()
        for (testCase in testCases) {
            val result = testObject.maxArea(testCase.input)
            assertEquals(testCase.expected, result)
        }
    }
}

private data class MaxWaterContainerTestCase(
    val expected: Int,
    val input: IntArray
)
