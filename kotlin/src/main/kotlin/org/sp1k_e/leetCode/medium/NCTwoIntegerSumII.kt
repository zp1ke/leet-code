package org.sp1k_e.leetCode.medium

// https://neetcode.io/problems/two-integer-sum-ii
class NCTwoIntegerSumII {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var left = 0
        var right = numbers.lastIndex
        while (left < right) {
            val sum = numbers[left] + numbers[right]
            if (sum == target) {
                return intArrayOf(left + 1, right + 1)
            }
            if (sum > target) {
                right--
            } else {
                left++
            }
        }
        return intArrayOf()
    }
}