package org.sp1k_e.leetCode.medium

// https://leetcode.com/problems/zigzag-conversion/description/
class ZigzagConversion {
    fun convert(s: String, numRows: Int): String {
        if (numRows <= 1) {
            return s
        }
        var stepY = 1 // down
        var rowIndex = 0
        val rows = Array(numRows) { "" }
        for (index in 0..s.lastIndex) {
            rows[rowIndex] += s.substring(index, index + 1)
            rowIndex += stepY
            if (rowIndex == rows.size || rowIndex == -1) {
                stepY *= -1
                rowIndex += stepY * 2
            }
        }
        var result = ""
        for (row in rows) {
            result += row
        }
        return result
    }
}