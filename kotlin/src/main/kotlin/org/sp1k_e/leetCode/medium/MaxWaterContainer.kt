package org.sp1k_e.leetCode.medium

// https://leetcode.com/problems/container-with-most-water/description/
class MaxWaterContainer {
    fun maxArea(heights: IntArray): Int {
        var maxArea = 0
        var left = 0
        var right = heights.lastIndex
        while (left < right) {
            val area = (right - left) * minOf(heights[left], heights[right])
            maxArea = maxOf(maxArea, area)
            if (heights[left] < heights[right]) {
                left++
            } else {
                right--
            }
        }
        return maxArea
    }
}