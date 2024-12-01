package org.sp1k_e.leetCode.easy

import kotlin.test.Test
import kotlin.test.assertEquals

class CheckNAndDoubleExistTests {
    @Test
    fun test() {
        val testCases = arrayOf(
            CheckNAndDoubleExistTestCase(true, intArrayOf(10, 2, 5, 3)),
            CheckNAndDoubleExistTestCase(false, intArrayOf(3, 1, 7, 11)),
            CheckNAndDoubleExistTestCase(false, intArrayOf(-2, 0, 10, -19, 4, 6, -8)),
        )
        val testObject = CheckNAndDoubleExist()
        for (testCase in testCases) {
            val result = testObject.checkIfExist(testCase.input)
            assertEquals(testCase.expected, result)
        }
    }
}

private data class CheckNAndDoubleExistTestCase(val expected: Boolean, val input: IntArray)