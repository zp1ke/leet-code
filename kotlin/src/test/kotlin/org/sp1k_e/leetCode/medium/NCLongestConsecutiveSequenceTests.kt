package org.sp1k_e.leetCode.medium

import kotlin.test.Test
import kotlin.test.assertEquals

class NCLongestConsecutiveSequenceTests {
    @Test
    fun test() {
        val testCases = arrayOf(
            NCLongestConsecutiveSequenceTestCase(
                4,
                input = intArrayOf(2, 20, 4, 10, 3, 4, 5)
            ),
            NCLongestConsecutiveSequenceTestCase(
                7,
                input = intArrayOf(0, 3, 2, 5, 4, 6, 1, 1)
            ),
        )
        val testObject = NCLongestConsecutiveSequence()
        for (testCase in testCases) {
            val result = testObject.longestConsecutive(testCase.input)
            assertEquals(testCase.expected, result)
        }
    }
}

private data class NCLongestConsecutiveSequenceTestCase(
    val expected: Int,
    val input: IntArray
)