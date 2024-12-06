package org.sp1k_e.leetCode.medium

// https://leetcode.com/problems/move-pieces-to-obtain-a-string/description/
class MovePiecesObtainString {
    fun canChange(start: String, target: String): Boolean {
        if (start.length != target.length) {
            return false
        }

        val startChars = start.toCharArray()
        val targetChars = target.toCharArray()
        val chars = mutableListOf<CharInfo>()
        var sIndex = 0
        var tIndex = 0
        while (sIndex < start.length) {
            val char = startChars[sIndex]

            if (char != '_') {
                var added = false
                while (!added && tIndex < target.length) {
                    val tChar = targetChars[tIndex]
                    tIndex += 1

                    if (tChar == char) {
                        chars.add(CharInfo(char, sIndex, tIndex - 1))
                        added = true
                    } else if (tChar != '_') {
                        return false
                    }
                }
                if (!added) {
                    return false
                }
            }

            sIndex += 1
        }

        while (tIndex < target.length) {
            if (targetChars[tIndex] != '_') {
                return false
            }
            tIndex += 1
        }

        return validateCharacterMovement(chars)
    }

    private fun validateCharacterMovement(chars: List<CharInfo>): Boolean {
        return chars.none { (char, sIndex, tIndex) ->
            (char == 'L' && sIndex < tIndex) || (char == 'R' && sIndex > tIndex)
        }
    }

    private data class CharInfo(val char: Char, val sIndex: Int, val tIndex: Int)
}