package org.sp1k_e.leetCode.easy

import kotlin.test.Test
import kotlin.test.assertEquals

class LongestCommonPrefixTests {
    @Test
    fun test() {
        val testCases = arrayOf(
            TestCase("fl", arrayOf("flower", "flow", "flight")),
            TestCase("", arrayOf("dog", "racecar", "car")),
            TestCase("a", arrayOf("ab", "a")),
            TestCase("", arrayOf("")),
        )
        val testObject = LongestCommonPrefix()
        for (testCase in testCases) {
            val result = testObject.longestCommonPrefix(testCase.input)
            assertEquals(testCase.expected, result)
        }
    }
}

private data class TestCase(val expected: String, val input: Array<String>)