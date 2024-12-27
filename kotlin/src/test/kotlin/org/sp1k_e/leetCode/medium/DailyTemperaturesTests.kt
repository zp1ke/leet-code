package org.sp1k_e.leetCode.medium

import kotlin.test.Test
import kotlin.test.assertContentEquals

class DailyTemperaturesTests {
    @Test
    fun test() {
        val testCases = arrayOf(
            DailyTemperaturesTestCase(
                input = intArrayOf(2, 1, 1, 3),
                expected = intArrayOf(3, 2, 1, 0)
            ),
            DailyTemperaturesTestCase(
                input = intArrayOf(73, 74, 75, 71, 69, 72, 76, 73),
                expected = intArrayOf(1, 1, 4, 2, 1, 1, 0, 0)
            ),
            DailyTemperaturesTestCase(
                input = intArrayOf(30, 40, 50, 60),
                expected = intArrayOf(1, 1, 1, 0)
            ),
            DailyTemperaturesTestCase(
                input = intArrayOf(30, 60, 90),
                expected = intArrayOf(1, 1, 0)
            ),
            DailyTemperaturesTestCase(
                input = intArrayOf(30, 38, 30, 36, 35, 40, 28),
                expected = intArrayOf(1, 4, 1, 2, 1, 0, 0)
            ),
            DailyTemperaturesTestCase(
                input = intArrayOf(22, 21, 20),
                expected = intArrayOf(0, 0, 0)
            ),
        )
        val testObject = DailyTemperatures()
        for (testCase in testCases) {
            val result = testObject.dailyTemperatures(testCase.input)
            assertContentEquals(testCase.expected, result)
        }
    }
}

private data class DailyTemperaturesTestCase(
    val expected: IntArray,
    val input: IntArray
)