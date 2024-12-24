package org.sp1k_e.leetCode.medium

// https://leetcode.com/problems/longest-consecutive-sequence/description/
class LongestConsecutiveSequence {
    fun longestConsecutive(nums: IntArray): Int {
        val numSet = nums.toSet()
        val sequenceStarts = mutableSetOf<Int>()
        for (num in numSet) {
            if (num - 1 !in numSet) {
                sequenceStarts.add(num)
            }
        }
        var result = 0
        for (num in sequenceStarts) {
            var value = num + 1
            while (value in numSet) {
                value++
            }
            result = maxOf(result, value - num)
        }
        return result
    }
}