package org.sp1k_e.leetCode.medium

// https://leetcode.com/problems/count-unguarded-cells-in-the-grid/description/
class CountUnguardedCells {
    fun countUnguarded(m: Int, n: Int, guards: Array<IntArray>, walls: Array<IntArray>): Int {
        val unguardedVal = 0
        val guardVal = 1
        val wallVal = 2
        val guardedVal = 3
        val cells = Array(m) { _ -> IntArray(n) }

        for (guard in guards) {
            cells[guard[0]][guard[1]] = guardVal
        }
        for (wall in walls) {
            cells[wall[0]][wall[1]] = wallVal
        }

        val directions = arrayOf(
            intArrayOf(1, 0), // right
            intArrayOf(-1, 0), // left
            intArrayOf(0, -1), // up
            intArrayOf(0, 1), // down
        )
        for (guard in guards) {
            for (direction in directions) {
                var x = guard[0]
                var y = guard[1]
                var cell = -1
                do {
                    x += direction[0]
                    y += direction[1]
                    if (x in 0..<m && y in 0..<n) {
                        cell = cells[x][y]
                        if (cell == unguardedVal) {
                            cells[x][y] = guardedVal
                        }
                    }
                } while (x in 0..<m && y in 0..<n && cell != guardVal && cell != wallVal)
            }
        }

        var count = 0
        for (row in cells) {
            for (cell in row) {
                if (cell == unguardedVal) {
                    count += 1
                }
            }
        }
        return count
    }
}
