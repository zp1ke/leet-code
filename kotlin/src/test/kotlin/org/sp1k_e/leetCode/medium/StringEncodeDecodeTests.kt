package org.sp1k_e.leetCode.medium

import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertNotNull

class StringEncodeDecodeTests {
    @Test
    fun test() {
        val testCases = arrayOf(
            StringEncodeDecodeTestCase(
                listOf("neet", "code", "love", "you")
            ),
            StringEncodeDecodeTestCase(
                listOf("we", "say", ":", "yes")
            ),
        )
        val testObject = StringEncodeDecode()
        for (testCase in testCases) {
            val encoded = testObject.encode(testCase.input)
            assertNotNull(encoded)
            val result = testObject.decode(encoded)
            assertContentEquals(testCase.input, result)
        }
    }
}

private data class StringEncodeDecodeTestCase(val input: List<String>)