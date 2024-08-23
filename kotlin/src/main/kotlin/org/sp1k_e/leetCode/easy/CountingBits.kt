package org.sp1k_e.leetCode.easy

// https://leetcode.com/problems/counting-bits/description/
class CountingBits {
    fun countBits(n: Int): IntArray {
        val array = IntArray(n + 1)
        val cache = mutableMapOf<Int, Int>()
        for (index in 0..n) {
            array[index] = countBitsOf(index, cache)
        }
        return array
    }

    private fun countBitsOf(number: Int, cache: MutableMap<Int, Int>): Int {
        if (cache.containsKey(number)) {
            return cache[number]!!
        }

        if (number == 0) {
            return 0
        }

        val count = 1 + countBitsOf(number and (number - 1), cache)
        cache[number] = count
        return count
    }
}