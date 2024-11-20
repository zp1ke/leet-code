package org.sp1k_e.leetCode.medium

// https://leetcode.com/problems/take-k-of-each-character-from-left-and-right/description/
class TakeKFromLeftRight {
    fun takeCharacters(s: String, k: Int): Int {
        if (k == 0) {
            return 0
        }

        val charsCount = mutableMapOf<Char, Int>()
        val chars = s.toCharArray()
        for (char in chars) {
            charsCount[char] = charsCount.getOrDefault(char, 0).plus(1)
        }
        if (charsCount.size != 3) {
            return -1;
        }
        val minCount = charsCount.values.minOrNull()
        if (minCount == null || minCount < k) {
            return -1
        }

        var left = 0
        var right = 0;
        var count = chars.size;
        while (right < chars.size) {
            val rightChar = chars[right]
            charsCount[rightChar] = charsCount[rightChar]!!.minus(1)
            right += 1

            var minCount = charsCount.values.minOrNull()!!
            while (minCount < k) {
                val leftChar = chars[left]
                charsCount[leftChar] = charsCount[leftChar]!!.plus(1)
                left += 1
                minCount = charsCount.values.minOrNull()!!
            }

            val currentCount = left + chars.size - right
            if (currentCount < count) {
                count = currentCount
            }
        }

        return count
    }
}