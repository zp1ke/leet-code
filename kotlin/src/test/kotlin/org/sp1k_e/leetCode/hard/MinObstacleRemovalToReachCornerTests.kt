package org.sp1k_e.leetCode.hard

import kotlin.test.Test
import kotlin.test.assertEquals

class MinObstacleRemovalToReachCornerTests {
    @Test
    fun test() {
        val testCases = arrayOf(
            MinObstacleRemovalToReachCornerTestCase(
                2,
                arrayOf(intArrayOf(0, 1, 1), intArrayOf(1, 1, 0), intArrayOf(1, 1, 0))
            ),
            MinObstacleRemovalToReachCornerTestCase(
                0,
                arrayOf(intArrayOf(0, 1, 0, 0, 0), intArrayOf(0, 1, 0, 1, 0), intArrayOf(0, 0, 0, 1, 0))
            ),
        )
        val testObject = MinObstacleRemovalToReachCorner()
        for (testCase in testCases) {
            val result = testObject.minimumObstacles(testCase.input)
            assertEquals(testCase.expected, result)
        }
    }
}

private data class MinObstacleRemovalToReachCornerTestCase(val expected: Int, val input: Array<IntArray>)