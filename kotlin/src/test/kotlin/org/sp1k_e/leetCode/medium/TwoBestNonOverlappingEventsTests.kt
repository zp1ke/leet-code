package org.sp1k_e.leetCode.medium

import kotlin.test.Test
import kotlin.test.assertEquals

class TwoBestNonOverlappingEventsTests {
    @Test
    fun test() {
        val testCases = arrayOf(
            TwoBestNonOverlappingEventsTestCase(
                10,
                arrayOf(intArrayOf(1, 3, 5), intArrayOf(2, 5, 6), intArrayOf(4, 6, 5), intArrayOf(7, 8, 4))
            ),
            TwoBestNonOverlappingEventsTestCase(
                4,
                arrayOf(intArrayOf(1, 3, 2), intArrayOf(4, 5, 2), intArrayOf(2, 4, 3))
            ),
            TwoBestNonOverlappingEventsTestCase(
                5,
                arrayOf(intArrayOf(1, 3, 2), intArrayOf(4, 5, 2), intArrayOf(1, 5, 5))
            ),
            TwoBestNonOverlappingEventsTestCase(
                5,
                arrayOf(intArrayOf(1, 3, 4), intArrayOf(3, 6, 3), intArrayOf(1, 2, 2))
            ),
            TwoBestNonOverlappingEventsTestCase(
                8,
                arrayOf(intArrayOf(1, 5, 3), intArrayOf(1, 5, 1), intArrayOf(6, 6, 5))
            ),
        )
        val testObject = TwoBestNonOverlappingEvents()
        for (testCase in testCases) {
            val result = testObject.maxTwoEvents(testCase.input)
            assertEquals(testCase.expected, result)
        }
    }
}

private data class TwoBestNonOverlappingEventsTestCase(
    val expected: Int,
    val input: Array<IntArray>
)