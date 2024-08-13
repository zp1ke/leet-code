package org.sp1k_e.leetCode.hard

import kotlin.test.Test
import kotlin.test.assertEquals

class RegularExpressionMatchingTests {
    @Test
    fun test() {
        val testCases = arrayOf(
            RegularExpressionMatchingTestCase(false, "a", "aa"),
            RegularExpressionMatchingTestCase(false, "mississippi", "mis* is * p *. "),
            RegularExpressionMatchingTestCase(false, "c", "a*"),
            RegularExpressionMatchingTestCase(true, "ab", ".*b"),
            RegularExpressionMatchingTestCase(true, "a", "a"),
            RegularExpressionMatchingTestCase(true, "aa", "a**"),
            RegularExpressionMatchingTestCase(true, "aa", "a*"),
            RegularExpressionMatchingTestCase(true, "", "a*"),
            RegularExpressionMatchingTestCase(true, "aa", ".*"),
            RegularExpressionMatchingTestCase(true, "a", ".*"),
            RegularExpressionMatchingTestCase(true, "aab", "c*a*b"),
            RegularExpressionMatchingTestCase(true, "abc", "a***abc"),
            RegularExpressionMatchingTestCase(true, "aaa", "ab*ac*a"),
            RegularExpressionMatchingTestCase(true, "c", ".*a*"),
            RegularExpressionMatchingTestCase(true, "aabcbcbcaccbcaabc", ".*a*aa*.*b*.c*.*a*"),
            RegularExpressionMatchingTestCase(true, "abcaaaaaaabaabcabac", ".*ab.a.*a*a*.*b*b*"),
        )
        val testObject = RegularExpressionMatching()
        for (testCase in testCases) {
            val result = testObject.isMatch(testCase.inputS, testCase.inputP)
            assertEquals(testCase.expected, result, testCase.errorWith(result))
        }
    }
}

private data class RegularExpressionMatchingTestCase(val expected: Boolean, val inputS: String, val inputP: String) {
    fun errorWith(result: Boolean): String {
        return "s = <$inputS>, p = <$inputP>, expected = $expected, result = $result"
    }
}