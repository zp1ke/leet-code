package org.sp1k_e.leetCode.medium

import kotlin.math.absoluteValue

// https://leetcode.com/problems/the-k-strongest-values-in-an-array/description/
class KStrongestValuesInArray {
    fun getStrongest(arr: IntArray, k: Int): IntArray {
        val sortedArray = arr.sortedArray()
        val medianIndex = (sortedArray.size - 1) / 2
        val median = sortedArray[medianIndex]

        val arrByStrongest = arr.toMutableList()
        arrByStrongest.sortWith { a, b ->
            val aValue = (a - median).absoluteValue
            val bValue = (b - median).absoluteValue
            when {
                (aValue != bValue) -> bValue - aValue
                else -> b - a
            }
        }
        return arrByStrongest.subList(0, k).toIntArray()
    }
}
