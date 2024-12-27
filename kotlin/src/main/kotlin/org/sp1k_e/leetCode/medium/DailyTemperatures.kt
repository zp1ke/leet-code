package org.sp1k_e.leetCode.medium

// https://leetcode.com/problems/daily-temperatures/description/
class DailyTemperatures {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        val stack = ArrayDeque<Int>()
        val result = IntArray(temperatures.size)
        for (index in temperatures.indices) {
            while (stack.isNotEmpty() && temperatures[stack.last()] < temperatures[index]) {
                val lastIndex = stack.removeLast()
                result[lastIndex] = index - lastIndex
            }
            stack.addLast(index)
        }
        return result
    }
}