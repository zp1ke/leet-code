package org.sp1k_e.leetCode.medium

// https://leetcode.com/problems/maximum-number-of-integers-to-choose-from-a-range-i/description/
class MaximumNumberIntegersChooseFromRangeI {
    fun maxCount(banned: IntArray, n: Int, maxSum: Int): Int {
        val bannedSet = banned.filter { v -> v <= n } .toSet()
        var sum = 0
        var count = 0
        for (i in 1..n) {
            if (bannedSet.contains(i)) {
                continue
            }
            sum += i
            if (sum > maxSum) {
                break
            }
            count++
        }
        return count
    }
}