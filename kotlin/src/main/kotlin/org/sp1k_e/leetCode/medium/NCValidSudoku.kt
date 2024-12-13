package org.sp1k_e.leetCode.medium

// https://neetcode.io/problems/valid-sudoku
class NCValidSudoku {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val sudokuSquareSize = 3
        val sudokuSize = sudokuSquareSize * sudokuSquareSize
        val rows = Array(sudokuSize) { mutableSetOf<Char>() }
        val cols = Array(sudokuSize) { mutableSetOf<Char>() }
        val squares = Array(sudokuSize) { mutableSetOf<Char>() }
        for (rowIndex in 0..<sudokuSize) {
            for (colIndex in 0..<sudokuSize) {
                val value = board[rowIndex][colIndex]
                if (value < '1' || value > '9') {
                    continue
                }
                if (!rows[rowIndex].add(value) || !cols[colIndex].add(value)) {
                    return false
                }
                val squareIndex = ((rowIndex / sudokuSquareSize) * sudokuSquareSize) + (colIndex / sudokuSquareSize)
                if (!squares[squareIndex].add(value)) {
                    return false
                }
            }
        }
        return true
    }
}