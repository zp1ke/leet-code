package org.sp1k_e.leetCode.easy

import kotlin.test.Test
import kotlin.test.assertEquals

class LongestCommonPrefixTests {
    @Test
    fun test() {
        val testCases = arrayOf(
            LongestCommonPrefixTestCase("fl", arrayOf("flower", "flow", "flight")),
            LongestCommonPrefixTestCase("", arrayOf("dog", "racecar", "car")),
            LongestCommonPrefixTestCase("a", arrayOf("ab", "a")),
            LongestCommonPrefixTestCase("", arrayOf("")),
        )
        val testObject = LongestCommonPrefix()
        for (testCase in testCases) {
            val result = testObject.longestCommonPrefix(testCase.input)
            assertEquals(testCase.expected, result)
        }
    }
}

private data class LongestCommonPrefixTestCase(val expected: String, val input: Array<String>)