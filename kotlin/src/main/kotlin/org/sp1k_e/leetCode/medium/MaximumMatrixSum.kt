package org.sp1k_e.leetCode.medium

import kotlin.math.absoluteValue

// https://leetcode.com/problems/maximum-matrix-sum/description/
class MaximumMatrixSum {
    fun maxMatrixSum(matrix: Array<IntArray>): Long {
        var sum = 0L
        var negativesCount = 0
        var minAbsValue = Int.MAX_VALUE

        for (row in matrix) {
            for (value in row) {
                val absValue = value.absoluteValue
                sum += absValue
                if (value < 0) {
                    negativesCount += 1
                }
                if (absValue < minAbsValue) {
                    minAbsValue = absValue
                }
            }
        }

        if (negativesCount % 2 != 0) {
            sum -= 2 * minAbsValue
        }

        return sum
    }
}