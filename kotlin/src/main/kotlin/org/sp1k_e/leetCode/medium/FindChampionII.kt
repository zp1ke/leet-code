package org.sp1k_e.leetCode.medium

// https://leetcode.com/problems/find-champion-ii/description/
class FindChampionII {
    fun findChampion(n: Int, edges: Array<IntArray>): Int {
        val weakCount = IntArray(n)
        for (relation in edges) {
            weakCount[relation.last()] += 1
        }
        var strong = -1
        for (index in 0..weakCount.lastIndex) {
            if (weakCount[index] == 0) {
                if (strong >= 0) {
                    return -1
                }
                strong = index
            }
        }
        return strong
    }
}