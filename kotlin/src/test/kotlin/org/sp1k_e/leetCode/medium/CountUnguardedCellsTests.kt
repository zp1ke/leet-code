package org.sp1k_e.leetCode.medium

import kotlin.test.Test
import kotlin.test.assertEquals

class CountUnguardedCellsTests {
    @Test
    fun test() {
        val testCases = arrayOf(
            CountUnguardedCellsTestCase(
                7,
                4,
                6,
                guards = arrayOf(intArrayOf(0, 0), intArrayOf(1, 1), intArrayOf(2, 3)),
                walls = arrayOf(intArrayOf(0, 1), intArrayOf(2, 2), intArrayOf(1, 4)),
            ),
            CountUnguardedCellsTestCase(
                4,
                3,
                3,
                guards = arrayOf(intArrayOf(1, 1)),
                walls = arrayOf(intArrayOf(0, 1), intArrayOf(1, 0), intArrayOf(2, 1), intArrayOf(1, 2)),
            ),
        )
        val testObject = CountUnguardedCells()
        for (testCase in testCases) {
            val result = testObject.countUnguarded(testCase.m, testCase.n, testCase.guards, testCase.walls)
            assertEquals(testCase.expected, result)
        }
    }
}

private data class CountUnguardedCellsTestCase(
    val expected: Int, val m: Int, val n: Int,
    val guards: Array<IntArray>, val walls: Array<IntArray>
)