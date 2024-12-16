package org.sp1k_e.leetCode.medium

import kotlin.test.Test
import kotlin.test.assertEquals

class NCThreeIntegerSumTests {
    @Test
    fun test() {
        val testCases = arrayOf(
            NCThreeIntegerSumTestCase(
                input = intArrayOf(-1, 0, 1, 2, -1, -4),
                expected = listOf(listOf(-1, -1, 2), listOf(-1, 0, 1))
            ),
            NCThreeIntegerSumTestCase(
                input = intArrayOf(0, 1, 1),
                expected = listOf()
            ),
            NCThreeIntegerSumTestCase(
                input = intArrayOf(0, 0, 0),
                expected = listOf(listOf(0, 0, 0))
            ),
            NCThreeIntegerSumTestCase(
                input = intArrayOf(0, 0, 0, 0),
                expected = listOf(listOf(0, 0, 0))
            ),
            NCThreeIntegerSumTestCase(
                input = intArrayOf(-2, 0, 1, 1, 2),
                expected = listOf(listOf(-2, 0, 2), listOf(-2, 1, 1))
            ),
        )
        val testObject = NCThreeIntegerSum()
        for (testCase in testCases) {
            val result = testObject.threeSum(testCase.input)
            assertEquals(testCase.expected.size, result.size)
        }
    }
}

private data class NCThreeIntegerSumTestCase(
    val expected: List<List<Int>>,
    val input: IntArray
)