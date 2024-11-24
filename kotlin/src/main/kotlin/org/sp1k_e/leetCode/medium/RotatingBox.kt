package org.sp1k_e.leetCode.medium

// https://leetcode.com/problems/rotating-the-box/description/
class RotatingBox {
    fun rotateTheBox(box: Array<CharArray>): Array<CharArray> {
        if (box.isEmpty()) {
            return arrayOf()
        }

        val stone = '#'
        val obstacle = '*'
        val rotated = Array(box.first().size) { _ -> CharArray(box.size) { _ -> '.' } }
        for (row in box.indices) {
            var fillCol = box[row].lastIndex
            for (col in box[row].lastIndex downTo 0) {
                if (box[row][col] == stone) {
                    rotated[fillCol][box.lastIndex - row] = box[row][col]
                    fillCol -= 1
                } else if (box[row][col] == obstacle) {
                    rotated[col][box.lastIndex - row] = box[row][col]
                    fillCol = col - 1
                }
            }
        }

        return rotated
    }
}