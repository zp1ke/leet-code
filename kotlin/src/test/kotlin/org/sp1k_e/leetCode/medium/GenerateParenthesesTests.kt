package org.sp1k_e.leetCode.medium

import kotlin.test.Test
import kotlin.test.assertContentEquals

class GenerateParenthesesTests {
    @Test
    fun test() {
        val testCases = arrayOf(
            GenerateParenthesesTestCase(
                listOf("()"),
                1
            ),
            GenerateParenthesesTestCase(
                listOf("(())", "()()"),
                2
            ),
            GenerateParenthesesTestCase(
                listOf("((()))", "(()())", "(())()", "()(())", "()()()"),
                3
            ),
            GenerateParenthesesTestCase(
                listOf("(((())))","((()()))","((())())","((()))()","(()(()))","(()()())","(()())()","(())(())","(())()()","()((()))","()(()())","()(())()","()()(())","()()()()"),
                4
            ),
        )
        val testObject = GenerateParentheses()
        for (testCase in testCases) {
            val result = testObject.generateParenthesis(testCase.input).sorted()
            val expectedSorted = testCase.expected.sorted()
            assertContentEquals(expectedSorted, result)
        }
    }
}

private data class GenerateParenthesesTestCase(
    val expected: List<String>,
    val input: Int
)