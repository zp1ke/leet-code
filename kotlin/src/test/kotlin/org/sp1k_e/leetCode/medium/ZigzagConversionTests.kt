package org.sp1k_e.leetCode.medium

import kotlin.test.Test
import kotlin.test.assertEquals

class ZigzagConversionTests {
    @Test
    fun test() {
        val testCases = arrayOf(
            ZigzagConversionTestCase("PAHNAPLSIIGYIR", "PAYPALISHIRING", 3),
            ZigzagConversionTestCase("A", "A", 1),
            ZigzagConversionTestCase("AB", "AB", 1),
            ZigzagConversionTestCase("ACEBD", "ABCDE", 2),
            ZigzagConversionTestCase("PINALSIGYAHRPI", "PAYPALISHIRING", 4),
            ZigzagConversionTestCase("AIQBHJPRXCGKOSWDFLNTVEMU",
                ('A'..'X').map { it.toString() }.reduce { acc, s -> acc + s }, 5),
        )
        val testObject = ZigzagConversion()
        for (testCase in testCases) {
            val result = testObject.convert(testCase.input, testCase.numberOfRows)
            assertEquals(testCase.expected, result)
        }
    }
}

private data class ZigzagConversionTestCase(val expected: String, val input: String, val numberOfRows: Int)