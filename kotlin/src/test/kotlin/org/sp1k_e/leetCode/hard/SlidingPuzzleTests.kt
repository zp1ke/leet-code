package org.sp1k_e.leetCode.hard

import kotlin.test.Test
import kotlin.test.assertEquals

class SlidingPuzzleTests {
    @Test
    fun test() {
        val testCases = arrayOf(
            SlidingPuzzleTestCase(1, arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 0, 5))),
            SlidingPuzzleTestCase(-1, arrayOf(intArrayOf(1, 2, 3), intArrayOf(5, 4, 0))),
            SlidingPuzzleTestCase(5, arrayOf(intArrayOf(4, 1, 2), intArrayOf(5, 0, 3))),
            SlidingPuzzleTestCase(0, arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 0))),
        )
        val testObject = SlidingPuzzle()
        for (testCase in testCases) {
            val result = testObject.slidingPuzzle(testCase.input)
            assertEquals(testCase.expected, result, testCase.errorWith(result))
        }
    }
}

private data class SlidingPuzzleTestCase(val expected: Int, val input: Array<IntArray>) {
    fun errorWith(result: Int): String {
        val inputStr = input.joinToString { arr -> "[${arr.joinToString { value -> value.toString() }}]" }
        return "board = [ $inputStr ], expected = $expected, result = $result"
    }
}