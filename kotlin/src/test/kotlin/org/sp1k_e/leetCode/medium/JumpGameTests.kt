package org.sp1k_e.leetCode.medium

import kotlin.test.Test
import kotlin.test.assertEquals

class JumpGameTests {
    @Test
    fun test() {
        val testCases = arrayOf(
            JumpGameTestCase(true, intArrayOf(2, 3, 1, 1, 4)),
            JumpGameTestCase(false, intArrayOf(3, 2, 1, 0, 4)),
        )
        val testObject = JumpGame()
        for (testCase in testCases) {
            val result = testObject.canJump(testCase.input)
            assertEquals(testCase.expected, result)
        }
    }
}

private data class JumpGameTestCase(val expected: Boolean, val input: IntArray)