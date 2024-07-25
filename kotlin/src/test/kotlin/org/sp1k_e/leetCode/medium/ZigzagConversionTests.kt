package org.sp1k_e.leetCode.medium

import kotlin.test.Test
import kotlin.test.assertEquals

class ZigzagConversionTests {
    @Test
    fun test() {
        val testCases = arrayOf(
            TestCase("PAHNAPLSIIGYIR", "PAYPALISHIRING", 3),
            TestCase("A", "A", 1),
            TestCase("AB", "AB", 1),
            TestCase("ACEBD", "ABCDE", 2),
            TestCase("PINALSIGYAHRPI", "PAYPALISHIRING", 4),
            TestCase("AIQBHJPRXCGKOSWDFLNTVEMU",
                ('A'..'X').map { it.toString() }.reduce { acc, s -> acc + s }, 5),
        )
        val testObject = ZigzagConversion()
        for (testCase in testCases) {
            val result = testObject.convert(testCase.input, testCase.numberOfRows)
            assertEquals(testCase.expected, result)
        }
    }
}

private data class TestCase(val expected: String, val input: String, val numberOfRows: Int)