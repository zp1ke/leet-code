package org.sp1k_e.leetCode.medium

import kotlin.test.Test
import kotlin.test.assertContentEquals

class NCTwoIntegerSumIITests {
    @Test
    fun test() {
        val testCases = arrayOf(
            NCTwoIntegerSumIITestCase(
                intArrayOf(1, 2),
                input = intArrayOf(1, 2, 3, 4),
                target = 3
            ),
            NCTwoIntegerSumIITestCase(
                intArrayOf(1, 2),
                input = intArrayOf(2, 7, 11, 15),
                target = 9
            ),
            NCTwoIntegerSumIITestCase(
                intArrayOf(1, 3),
                input = intArrayOf(2, 3, 4),
                target = 6
            ),
            NCTwoIntegerSumIITestCase(
                intArrayOf(1, 2),
                input = intArrayOf(-1, 0),
                target = -1
            ),
        )
        val testObject = NCTwoIntegerSumII()
        for (testCase in testCases) {
            val result = testObject.twoSum(testCase.input, testCase.target)
            assertContentEquals(testCase.expected, result)
        }
    }
}

private data class NCTwoIntegerSumIITestCase(
    val expected: IntArray,
    val input: IntArray,
    val target: Int
)