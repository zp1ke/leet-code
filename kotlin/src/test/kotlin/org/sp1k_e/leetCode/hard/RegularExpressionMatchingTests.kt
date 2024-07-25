package org.sp1k_e.leetCode.hard

import kotlin.test.Test
import kotlin.test.assertEquals

class RegularExpressionMatchingTests {
    @Test
    fun test() {
        val testCases = arrayOf(
            TestCase(false, "a", "aa"),
            TestCase(true, "a", "a"),
            TestCase(true, "aa", "a**"),
            TestCase(true, "aa", "a*"),
            TestCase(true, "", "a*"),
            TestCase(true, "aa", ".*"),
        )
        val testObject = RegularExpressionMatching()
        for (testCase in testCases) {
            val result = testObject.isMatch(testCase.inputS, testCase.inputP)
            assertEquals(testCase.expected, result, testCase.errorWith(result))
        }
    }
}

private data class TestCase(val expected: Boolean, val inputS: String, val inputP: String) {
    fun errorWith(result: Boolean): String {
        return "s = <$inputS>, p = <$inputP>, expected = $expected, result = $result"
    }
}