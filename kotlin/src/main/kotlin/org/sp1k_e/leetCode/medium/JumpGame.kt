package org.sp1k_e.leetCode.medium

import kotlin.math.min

// https://leetcode.com/problems/jump-game/description/
class JumpGame {
    fun canJump(nums: IntArray): Boolean {
        return canJumpTo(nums, 0, mutableSetOf())
    }

    private fun canJumpTo(nums: IntArray, index: Int, cache: MutableSet<Int>): Boolean {
        if (index == nums.lastIndex) {
            return true
        }

        if (cache.contains(index) || nums[index] <= 0) {
            return false
        }

        var jumps = min(nums[index], nums.lastIndex - index)
        while (jumps > 0) {
            if (canJumpTo(nums, index + jumps, cache)) {
                return true
            }
            jumps--
        }

        cache.add(index)
        return false
    }
}