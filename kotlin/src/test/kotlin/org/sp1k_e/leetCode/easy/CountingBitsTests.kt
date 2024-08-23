package org.sp1k_e.leetCode.easy

import kotlin.test.Test
import kotlin.test.assertEquals

class CountingBitsTests {
    @Test
    fun test() {
        val testCases = arrayOf(
            CountingBitsTestCase(expected = intArrayOf(0, 1, 1), input = 2),
            CountingBitsTestCase(expected = intArrayOf(0, 1, 1, 2, 1, 2), input = 5),
        )
        val testObject = CountingBits()
        for (testCase in testCases) {
            val result = testObject.countBits(testCase.input)
            assertEquals(testCase.expected, result)
        }
    }
}

data class CountingBitsTestCase(val expected: IntArray, val input: Int)