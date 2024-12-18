package org.sp1k_e.leetCode.hard

// https://leetcode.com/problems/trapping-rain-water/description/
class TrappingRainWater {
    fun trap(height: IntArray): Int {
        if (height.isEmpty()) {
            return 0
        }
        var maxLeft = height.first()
        var maxRight = height.last()
        var left = 0
        var right = height.lastIndex
        var result = 0
        while (left < right) {
            if (maxLeft < maxRight) {
                left++
                result += maxOf(0, maxLeft - height[left])
                maxLeft = maxOf(maxLeft, height[left])
            } else {
                right--
                result += maxOf(0, maxRight - height[right])
                maxRight = maxOf(maxRight, height[right])
            }
        }
        return result
    }
}