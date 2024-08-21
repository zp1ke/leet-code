package org.sp1k_e.leetCode.medium

import kotlin.math.absoluteValue

// https://leetcode.com/problems/the-k-strongest-values-in-an-array/description/
class KStrongestValuesInArray {
    fun getStrongest(arr: IntArray, k: Int): IntArray {
        val median = arr.sortedArray().median
        val arrByStrongest = arr.toMutableList()
        arrByStrongest.sortWith { a, b ->
            val aValue = (a - median).absoluteValue
            val bValue = (b - median).absoluteValue
            when {
                (aValue != bValue) -> aValue - bValue
                else -> a - b
            }
        }
        return arrByStrongest.reversed().subList(0, k).toIntArray()
    }
}

private val IntArray.median: Int
    get() {
        val medianIndex = (size - 1) / 2
        return this[medianIndex]
    }