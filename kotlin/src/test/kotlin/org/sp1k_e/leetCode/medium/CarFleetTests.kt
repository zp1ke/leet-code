package org.sp1k_e.leetCode.medium

import kotlin.test.Test
import kotlin.test.assertEquals

class CarFleetTests {
    @Test
    fun test() {
        val testCases = arrayOf(
            CarFleetTestCase(
                input = 12,
                expected = 3,
                position = intArrayOf(10, 8, 0, 5, 3),
                speed = intArrayOf(2, 4, 1, 1, 3)
            ),
            CarFleetTestCase(
                input = 10,
                expected = 1,
                position = intArrayOf(3),
                speed = intArrayOf(3)
            ),
            CarFleetTestCase(
                input = 100,
                expected = 1,
                position = intArrayOf(0, 2, 4),
                speed = intArrayOf(4, 2, 1)
            ),
            CarFleetTestCase(
                input = 10,
                expected = 1,
                position = intArrayOf(1, 4),
                speed = intArrayOf(3, 2)
            ),
            CarFleetTestCase(
                input = 10,
                expected = 3,
                position = intArrayOf(4, 1, 0, 7),
                speed = intArrayOf(2, 2, 1, 1)
            ),
            CarFleetTestCase(
                input = 10,
                expected = 2,
                position = intArrayOf(6, 8),
                speed = intArrayOf(3, 2)
            ),
        )
        val testObject = CarFleet()
        for (testCase in testCases) {
            val result = testObject.carFleet(testCase.input, position = testCase.position, speed = testCase.speed)
            assertEquals(testCase.expected, result)
        }
    }
}

private data class CarFleetTestCase(
    val expected: Int,
    val input: Int,
    val position: IntArray,
    val speed: IntArray,
)