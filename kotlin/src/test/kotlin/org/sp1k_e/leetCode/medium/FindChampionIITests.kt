package org.sp1k_e.leetCode.medium

import kotlin.test.Test
import kotlin.test.assertEquals

class FindChampionIITests {
    @Test
    fun test() {
        val testCases = arrayOf(
            FindChampionIITestCase(0, arrayOf(intArrayOf(0, 1), intArrayOf(1, 2)), 3),
            FindChampionIITestCase(-1, arrayOf(intArrayOf(0, 2), intArrayOf(1, 3), intArrayOf(1, 2)), 4),
        )
        val testObject = FindChampionII()
        for (testCase in testCases) {
            val result = testObject.findChampion(testCase.n, testCase.input)
            assertEquals(testCase.expected, result)
        }
    }
}

private data class FindChampionIITestCase(val expected: Int, val input: Array<IntArray>, val n: Int)