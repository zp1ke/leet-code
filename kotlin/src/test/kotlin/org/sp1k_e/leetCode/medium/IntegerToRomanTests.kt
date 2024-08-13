package org.sp1k_e.leetCode.medium

import kotlin.test.Test
import kotlin.test.assertEquals

class IntegerToRomanTests {
    @Test
    fun test() {
        val testCases = arrayOf(
            IntegerToRomanTestCase("I", 1),
            IntegerToRomanTestCase("III", 3),
            IntegerToRomanTestCase("VI", 6),
            IntegerToRomanTestCase("IV", 4),
            IntegerToRomanTestCase("V", 5),
            IntegerToRomanTestCase("VIII", 8),
            IntegerToRomanTestCase("IX", 9),
            IntegerToRomanTestCase("X", 10),
            IntegerToRomanTestCase("XXI", 21),
            IntegerToRomanTestCase("LVIII", 58),
            IntegerToRomanTestCase("MCMXCIV", 1994),
            IntegerToRomanTestCase("MMMDCCXLIX", 3749),
            IntegerToRomanTestCase("MMMCMXCIX", 3999),
        )
        val testObject = IntegerToRoman()
        for (testCase in testCases) {
            val result = testObject.intToRoman(testCase.input)
            assertEquals(testCase.expected, result)
        }
    }
}

private data class IntegerToRomanTestCase(val expected: String, val input: Int)