package org.sp1k_e.leetCode.medium

// https://leetcode.com/problems/integer-to-roman/description/
class IntegerToRoman {
    fun intToRoman(num: Int): String {
        val table = mapOf(
            1 to "I",
            5 to "V",
            10 to "X",
            50 to "L",
            100 to "C",
            500 to "D",
            1000 to "M"
        )
        var result = ""
        val numChars = num.toString().toCharArray()
        var power = numChars.size - 1
        for (ch in numChars) {
            val digit = ch.digitToInt()
            val tenPower = tenPow(power)
            val value = digit * tenPower

            if (table.containsKey(value)) {
                result += table[value]
            } else if (digit in 2..3) {
                val key = value / digit
                for (i in 1..digit) {
                    result += table[key]
                }
            } else if (digit in 6..8) {
                val fiveKey = 5 * tenPower
                result += table[fiveKey]
                for (i in 1..digit - 5) {
                    result += table[tenPower]
                }
            } else if (digit == 4 || digit == 9) {
                val parentKey = (digit + 1) * tenPower
                result += table[tenPower]
                result += table[parentKey]
            }

            power--
        }
        return result
    }

    private fun tenPow(exp: Int): Int {
        var result = 1
        for (i in 1..exp) {
            result *= 10
        }
        return result
    }
}