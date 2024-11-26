package org.sp1k_e.leetCode.hard

// https://leetcode.com/problems/sliding-puzzle/description/
class SlidingPuzzle {
    fun slidingPuzzle(board: Array<IntArray>): Int {
        val boardStr = board.reduce { arr1, arr2 -> arr1 + arr2 }
            .joinToString(separator = "") { i -> i.toString() }
        val indexSwaps = mapOf(
            0 to intArrayOf(1, 3),
            1 to intArrayOf(0, 2, 4),
            2 to intArrayOf(1, 5),
            3 to intArrayOf(0, 4),
            4 to intArrayOf(1, 3, 5),
            5 to intArrayOf(4, 2),
        )

        val queue = ArrayDeque(listOf(BoardInfo(boardStr, boardStr.indexOf("0"))))
        val checked = mutableSetOf<String>()
        while (queue.isNotEmpty()) {
            val boardInfo = queue.removeFirst()
            if (boardInfo.board == "123450") {
                return boardInfo.step
            }

            for (indexSwap in indexSwaps[boardInfo.index]!!) {
                val swapBoard = boardInfo.board.toCharArray()
                swapBoard[boardInfo.index] =
                    swapBoard[indexSwap].also { swapBoard[indexSwap] = swapBoard[boardInfo.index] }
                val newBoardStr = swapBoard.joinToString(separator = "") { i -> i.toString() }

                if (!checked.contains(newBoardStr)) {
                    queue.add(BoardInfo(newBoardStr, indexSwap, boardInfo.step + 1))
                    checked.add(newBoardStr)
                }
            }
        }

        return -1
    }

    private data class BoardInfo(val board: String, val index: Int, val step: Int = 0)
}