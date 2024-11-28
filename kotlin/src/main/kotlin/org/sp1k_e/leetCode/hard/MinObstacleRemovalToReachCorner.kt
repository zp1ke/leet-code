package org.sp1k_e.leetCode.hard

// https://leetcode.com/problems/minimum-obstacle-removal-to-reach-corner/description/
class MinObstacleRemovalToReachCorner {
    fun minimumObstacles(grid: Array<IntArray>): Int {
        val rows = grid.size
        val cols = grid.first().size

        val firstCell = Cell(grid[0][0], 0, 0)
        val visited = mutableSetOf(firstCell)
        val queue = ArrayDeque<Cell>()
        queue.add(firstCell)
        while (queue.isNotEmpty()) {
            val cell = queue.removeFirst()
            if (cell.row == rows - 1 && cell.col == cols - 1) {
                return cell.obstacles
            }

            val neighbors = arrayOf(
                Cell(0, cell.row + 1, cell.col),
                Cell(0, cell.row - 1, cell.col),
                Cell(0, cell.row, cell.col + 1),
                Cell(0, cell.row, cell.col - 1),
            )
            for (neighbor in neighbors) {
                if (!visited.contains(neighbor) && neighbor.inside(rows, cols)) {
                    visited.add(neighbor)
                    if (grid[neighbor.row][neighbor.col] == 1) {
                        queue.addLast(Cell(cell.obstacles + 1, neighbor.row, neighbor.col))
                    } else {
                        queue.addFirst(Cell(cell.obstacles, neighbor.row, neighbor.col))
                    }
                }
            }
        }

        return -1
    }

    private data class Cell(val obstacles: Int, val row: Int, val col: Int) {
        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (javaClass == other?.javaClass) {
                other as Cell
                return row == other.row && col == other.col
            }
            return false
        }

        override fun hashCode(): Int {
            return row * 31 + col
        }

        fun inside(rows: Int, cols: Int): Boolean {
            return row in 0..<rows && col in 0..<cols
        }
    }
}