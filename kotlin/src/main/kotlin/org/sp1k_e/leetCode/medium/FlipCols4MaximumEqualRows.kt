package org.sp1k_e.leetCode.medium

// https://leetcode.com/problems/flip-columns-for-maximum-number-of-equal-rows/description/
class FlipCols4MaximumEqualRows {
    fun maxEqualRowsAfterFlips(matrix: Array<IntArray>): Int {
        val hashCount = mutableMapOf<String, Int>()
        for (row in matrix) {
            val theRow = if (row.isNotEmpty() && row.first() == 0) invertRow(row) else row
            val hash = theRow.joinToString { i: Int -> i.toString() }
            hashCount[hash] = hashCount.getOrDefault(hash, 0) + 1
        }
        return hashCount.values.max()
    }

    private fun invertRow(row: IntArray): IntArray {
        val inverted = IntArray(row.size)
        for (index in row.indices) {
            inverted[index] = if (row[index] == 0) 1 else 0
        }
        return inverted
    }
}