package org.sp1k_e.leetCode.medium

import kotlin.test.Test
import kotlin.test.assertContentEquals

class NCProductsArrayDiscludingSelfTests {
    @Test
    fun test() {
        val testCases = arrayOf(
            ProductsArrayDiscludingSelfTestCase(
                intArrayOf(48, 24, 12, 8),
                input = intArrayOf(1, 2, 4, 6)
            ),
            ProductsArrayDiscludingSelfTestCase(
                intArrayOf(0, -6, 0, 0, 0),
                input = intArrayOf(-1, 0, 1, 2, 3)
            ),
        )
        val testObject = NCProductsArrayDiscludingSelf()
        for (testCase in testCases) {
            val result = testObject.productExceptSelf(testCase.input)
            assertContentEquals(testCase.expected, result)
        }
    }
}

private data class ProductsArrayDiscludingSelfTestCase(
    val expected: IntArray,
    val input: IntArray
)