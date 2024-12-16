package org.sp1k_e.leetCode.medium

import kotlin.test.Test
import kotlin.test.assertEquals

class NCValidSudokuTests {
    @Test
    fun test() {
        val testCases = arrayOf(
            ValidSudokuTestCase(
                true,
                input = arrayOf(
                    charArrayOf('1', '2', '.', '.', '3', '.', '.', '.', '.'),
                    charArrayOf('4', '.', '.', '5', '.', '.', '.', '.', '.'),
                    charArrayOf('.', '9', '8', '.', '.', '.', '.', '.', '3'),
                    charArrayOf('5', '.', '.', '.', '6', '.', '.', '.', '4'),
                    charArrayOf('.', '.', '.', '8', '.', '3', '.', '.', '5'),
                    charArrayOf('7', '.', '.', '.', '2', '.', '.', '.', '6'),
                    charArrayOf('.', '.', '.', '.', '.', '.', '2', '.', '.'),
                    charArrayOf('.', '.', '.', '4', '1', '9', '.', '.', '8'),
                    charArrayOf('.', '.', '.', '.', '8', '.', '.', '7', '9')
                ),
            ),
            ValidSudokuTestCase(
                false,
                input = arrayOf(
                    charArrayOf('1', '2', '.', '.', '3', '.', '.', '.', '.'),
                    charArrayOf('4', '.', '.', '5', '.', '.', '.', '.', '.'),
                    charArrayOf('.', '9', '1', '.', '.', '.', '.', '.', '3'),
                    charArrayOf('5', '.', '.', '.', '6', '.', '.', '.', '4'),
                    charArrayOf('.', '.', '.', '8', '.', '3', '.', '.', '5'),
                    charArrayOf('7', '.', '.', '.', '2', '.', '.', '.', '6'),
                    charArrayOf('.', '.', '.', '.', '.', '.', '2', '.', '.'),
                    charArrayOf('.', '.', '.', '4', '1', '9', '.', '.', '8'),
                    charArrayOf('.', '.', '.', '.', '8', '.', '.', '7', '9')
                ),
            )
        )
        val testObject = NCValidSudoku()
        for (testCase in testCases) {
            val result = testObject.isValidSudoku(testCase.input)
            assertEquals(testCase.expected, result)
        }
    }
}

private data class ValidSudokuTestCase(
    val expected: Boolean,
    val input: Array<CharArray>
)