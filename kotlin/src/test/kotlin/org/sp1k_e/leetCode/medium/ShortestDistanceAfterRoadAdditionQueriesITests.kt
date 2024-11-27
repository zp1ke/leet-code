package org.sp1k_e.leetCode.medium

import org.junit.jupiter.api.Assertions.assertTrue
import kotlin.test.Test

class ShortestDistanceAfterRoadAdditionQueriesITests {
    @Test
    fun test() {
        val testCases = arrayOf(
            ShortestDistanceAfterRoadAdditionQueriesITestCase(
                intArrayOf(3, 2, 1),
                arrayOf(intArrayOf(2, 4), intArrayOf(0, 2), intArrayOf(0, 4)),
                5
            ),
            ShortestDistanceAfterRoadAdditionQueriesITestCase(
                intArrayOf(1, 1),
                arrayOf(intArrayOf(0, 3), intArrayOf(0, 2)),
                4
            ),
            ShortestDistanceAfterRoadAdditionQueriesITestCase(
                intArrayOf(3, 2),
                arrayOf(intArrayOf(1, 3), intArrayOf(0, 3)),
                5
            ),
        )
        val testObject = ShortestDistanceAfterRoadAdditionQueriesI()
        for (testCase in testCases) {
            val result = testObject.shortestDistanceAfterQueries(testCase.n, testCase.input)
            assertTrue(testCase.expected.contentEquals(result), testCase.errorWith(result))
        }
    }
}

private data class ShortestDistanceAfterRoadAdditionQueriesITestCase(
    val expected: IntArray,
    val input: Array<IntArray>,
    val n: Int
) {
    fun errorWith(result: IntArray): String {
        val inputStr = input.joinToString { arr -> "[${arr.joinToString { value -> value.toString() }}]" }
        val expectedStr = expected.joinToString { value -> value.toString() }
        val resultStr = result.joinToString { value -> value.toString() }
        return "input = [ $inputStr ], n = $n, expected = [ $expectedStr ], result = [ $resultStr ]"
    }
}