package org.sp1k_e.leetCode.medium

import kotlin.test.Test
import kotlin.test.assertEquals

class MinStackTests {
    @Test
    fun test() {
        val testCases = arrayOf(
            MinStackTestCase(
                input = arrayOf("MinStack", "push", "push", "push", "getMin", "pop", "top", "getMin"),
                values = arrayOf(null, -2, 0, -3, null, null, null, null),
                expected = arrayOf(null, null, null, null, -3, null, 0, -2)
            ),
            MinStackTestCase(
                input = arrayOf("MinStack", "push", "push", "push", "getMin", "pop", "top", "getMin"),
                values = arrayOf(null, 1, 2, 0, null, null, null, null),
                expected = arrayOf(null, null, null, null, 0, null, 2, 1)
            ),
        )
        for (testCase in testCases) {
            var testObject = MinStack()
            for (i in testCase.input.indices) {
                when (testCase.input[i]) {
                    "MinStack" -> testObject = MinStack()
                    "push" -> testObject.push(testCase.values[i]!!)
                    "pop" -> testObject.pop()
                    "top" -> assertEquals(testCase.expected[i], testObject.top())
                    "getMin" -> assertEquals(testCase.expected[i], testObject.getMin())
                }
            }
        }
    }
}

private data class MinStackTestCase(
    val expected: Array<Int?>,
    val input: Array<String>,
    val values: Array<Int?>
)