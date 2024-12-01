package org.sp1k_e.leetCode.easy

// https://leetcode.com/problems/check-if-n-and-its-double-exist/description/
class CheckNAndDoubleExist {
    fun checkIfExist(arr: IntArray): Boolean {
        val lookup = mutableMapOf<Int, Int>()
        for (i in arr.indices) {
            lookup[arr[i]] = i
        }

        for (i in arr.indices) {
            val value = arr[i]
            if ((lookup.containsKey(value * 2) && i !== lookup[value * 2]) ||
                (value != 0 && value % 2 == 0 && lookup.containsKey(value / 2))
            ) {
                return true
            }
        }

        return false
    }
}