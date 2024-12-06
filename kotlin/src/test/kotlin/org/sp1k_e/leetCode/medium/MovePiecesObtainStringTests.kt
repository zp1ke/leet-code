package org.sp1k_e.leetCode.medium

import kotlin.test.Test
import kotlin.test.assertEquals

class MovePiecesObtainStringTests {
    @Test
    fun test() {
        val testCases = arrayOf(
            MovePiecesObtainStringTestCase(true, "_L__R__R_", "L______RR"),
            MovePiecesObtainStringTestCase(false, "R_L_", "__LR"),
            MovePiecesObtainStringTestCase(false, "_R", "R_"),
            MovePiecesObtainStringTestCase(false, "____", "R_L_"),
        )
        val testObject = MovePiecesObtainString()
        for (testCase in testCases) {
            val result = testObject.canChange(testCase.input, testCase.target)
            assertEquals(testCase.expected, result)
        }
    }
}

private data class MovePiecesObtainStringTestCase(val expected: Boolean, val input: String, val target: String)