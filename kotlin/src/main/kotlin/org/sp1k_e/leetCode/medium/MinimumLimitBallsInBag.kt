package org.sp1k_e.leetCode.medium

// https://leetcode.com/problems/minimum-limit-of-balls-in-a-bag/description/
class MinimumLimitBallsInBag {
    fun minimumSize(nums: IntArray, maxOperations: Int): Int {
        var min = 0
        var max = nums.max()
        while (min < max) {
            val mid = (min + max) / 2
            if (canDivide(nums, maxOperations, mid)) {
                max = mid
            } else {
                min = mid + 1
            }
        }
        return min
    }

    private fun canDivide(nums: IntArray, maxOperations: Int, balls: Int): Boolean {
        var operations = 0
        for (num in nums) {
            operations += Math.ceil(num.toDouble() / balls).toInt() - 1
            if (operations > maxOperations) {
                return false
            }
        }
        return true
    }
}