package org.sp1k_e.leetCode.easy

import kotlin.test.Test
import kotlin.test.assertEquals

class ValidPalindromeTests {
    @Test
    fun test() {
        val testCases = arrayOf(
            ValidPalindromeTestCase(
                true,
                input = "Was it a car or a cat I saw?"
            ),
            ValidPalindromeTestCase(
                false,
                input = "tab a cat"
            ),
            ValidPalindromeTestCase(
                true,
                input = ".,"
            ),
        )
        val testObject = ValidPalindrome()
        for (testCase in testCases) {
            val result = testObject.isPalindrome(testCase.input)
            assertEquals(testCase.expected, result)
        }
    }
}

private data class ValidPalindromeTestCase(
    val expected: Boolean,
    val input: String
)