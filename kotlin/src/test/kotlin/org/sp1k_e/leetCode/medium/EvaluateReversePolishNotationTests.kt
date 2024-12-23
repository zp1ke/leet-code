package org.sp1k_e.leetCode.medium

import kotlin.test.Test
import kotlin.test.assertEquals

class EvaluateReversePolishNotationTests {
    @Test
    fun test() {
        val testCases = arrayOf(
            EvaluateReversePolishNotationTestCase(
                9,
                arrayOf("2", "1", "+", "3", "*")
            ),
            EvaluateReversePolishNotationTestCase(
                6,
                arrayOf("4", "13", "5", "/", "+")
            ),
            EvaluateReversePolishNotationTestCase(
                22,
                arrayOf("10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+")
            ),
            EvaluateReversePolishNotationTestCase(
                5,
                arrayOf("1", "2", "+", "3", "*", "4", "-")
            ),
        )
        val testObject = EvaluateReversePolishNotation()
        for (testCase in testCases) {
            val result = testObject.evalRPN(testCase.input)
            assertEquals(testCase.expected, result)
        }
    }
}

private data class EvaluateReversePolishNotationTestCase(
    val expected: Int,
    val input: Array<String>
)