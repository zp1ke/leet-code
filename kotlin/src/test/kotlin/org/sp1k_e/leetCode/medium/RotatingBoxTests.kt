package org.sp1k_e.leetCode.medium

import kotlin.test.Test
import kotlin.test.assertTrue

class RotatingBoxTests {
    @Test
    fun test() {
        val testCases = arrayOf(
            RotatingBoxTestCase(
                arrayOf(charArrayOf('.'), charArrayOf('#'), charArrayOf('#')),
                arrayOf(charArrayOf('#', '.', '#'))
            ),
            RotatingBoxTestCase(
                arrayOf(charArrayOf('#', '.'), charArrayOf('#', '#'), charArrayOf('*', '*'), charArrayOf('.', '.')),
                arrayOf(charArrayOf('#', '.', '*', '.'), charArrayOf('#', '#', '*', '.'))
            ),
            RotatingBoxTestCase(
                arrayOf(
                    charArrayOf('.', '#', '#'),
                    charArrayOf('.', '#', '#'),
                    charArrayOf('#', '#', '*'),
                    charArrayOf('#', '*', '.'),
                    charArrayOf('#', '.', '*'),
                    charArrayOf('#', '.', '.')
                ),
                arrayOf(
                    charArrayOf('#', '#', '*', '.', '*', '.'),
                    charArrayOf('#', '#', '#', '*', '.', '.'),
                    charArrayOf('#', '#', '#', '.', '#', '.')
                )
            ),
        )
        val testObject = RotatingBox()
        for (testCase in testCases) {
            val result = testObject.rotateTheBox(testCase.input)
            assertTrue(testCase.expected.contentDeepEquals(result))
        }
    }
}

private data class RotatingBoxTestCase(val expected: Array<CharArray>, val input: Array<CharArray>)