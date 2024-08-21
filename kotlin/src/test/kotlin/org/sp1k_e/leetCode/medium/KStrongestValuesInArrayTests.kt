package org.sp1k_e.leetCode.medium

import kotlin.test.Test
import kotlin.test.assertContentEquals

class KStrongestValuesInArrayTests {
    @Test
    fun test() {
        val testCases = arrayOf(
            KStrongestValuesInArrayTestCase(intArrayOf(5, 1), 2, intArrayOf(1, 2, 3, 4, 5)),
            KStrongestValuesInArrayTestCase(intArrayOf(5, 5), 2, intArrayOf(1, 1, 3, 5, 5)),
            KStrongestValuesInArrayTestCase(intArrayOf(11, 8, 6, 6, 7), 5, intArrayOf(6, 7, 11, 7, 6, 8)),
        )
        val testObject = KStrongestValuesInArray()
        for (testCase in testCases) {
            val result = testObject.getStrongest(testCase.inputA, testCase.inputK)
            assertContentEquals(testCase.expected, result, testCase.errorWith(result))
        }
    }
}

private data class KStrongestValuesInArrayTestCase(val expected: IntArray, val inputK: Int, val inputA: IntArray) {
    fun errorWith(result: IntArray): String {
        val inputAStr = inputA.contentToString()
        val expectedStr = expected.contentToString()
        val resultStr = result.contentToString()
        return "k = <$inputK>, array = <$inputAStr>, expected = $expectedStr, result = $resultStr"
    }
}