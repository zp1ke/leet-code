package org.sp1k_e.leetCode.easy

import kotlin.test.Test
import kotlin.test.assertEquals

class ValidParenthesesTests {
    @Test
    fun test() {
        val testCases = arrayOf(
            ValidParenthesesTestCase(
                true,
                "()"
            ),
            ValidParenthesesTestCase(
                true,
                "[]"
            ),
            ValidParenthesesTestCase(
                true,
                "([{}])"
            ),
            ValidParenthesesTestCase(
                true,
                "()[]{}"
            ),
            ValidParenthesesTestCase(
                true,
                "([])"
            ),
            ValidParenthesesTestCase(
                false,
                "(]"
            ),
            ValidParenthesesTestCase(
                false,
                "[(])"
            ),
        )
        val testObject = ValidParentheses()
        for (testCase in testCases) {
            val result = testObject.isValid(testCase.input)
            assertEquals(testCase.expected, result)
        }
    }
}

private data class ValidParenthesesTestCase(
    val expected: Boolean,
    val input: String
)