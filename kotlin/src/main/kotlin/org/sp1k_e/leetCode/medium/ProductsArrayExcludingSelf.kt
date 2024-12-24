package org.sp1k_e.leetCode.medium

// https://leetcode.com/problems/product-of-array-except-self/description/
class ProductsArrayExcludingSelf {
    fun productExceptSelf(nums: IntArray): IntArray {
        val prefix = IntArray(nums.size)
        var prev = 1
        for (i in 0..nums.lastIndex) {
            prefix[i] = prev
            prev *= nums[i]
        }

        val suffix = IntArray(nums.size)
        prev = 1
        for (i in nums.lastIndex downTo 0) {
            suffix[i] = prev
            prev *= nums[i]
        }

        val result = IntArray(nums.size)
        for (i in 0..nums.lastIndex) {
            result[i] = prefix[i] * suffix[i]
        }
        return result
    }
}