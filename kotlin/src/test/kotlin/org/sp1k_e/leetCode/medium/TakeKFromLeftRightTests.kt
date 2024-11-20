package org.sp1k_e.leetCode.medium

import kotlin.test.Test
import kotlin.test.assertEquals

class TakeKFromLeftRightTests {
    @Test
    fun test() {
        val testCases = arrayOf(
            TakeKFromLeftRightTestCase(8, "aabaaaacaabc", 2),
            TakeKFromLeftRightTestCase(-1, "abcbab", 2),
            TakeKFromLeftRightTestCase(-1, "a", 1),
            TakeKFromLeftRightTestCase(0, "a", 0),
        )
        val testObject = TakeKFromLeftRight()
        for (testCase in testCases) {
            val result = testObject.takeCharacters(testCase.input, testCase.k)
            assertEquals(testCase.expected, result)
        }
    }
}

private data class TakeKFromLeftRightTestCase(val expected: Int, val input: String, val k: Int)
