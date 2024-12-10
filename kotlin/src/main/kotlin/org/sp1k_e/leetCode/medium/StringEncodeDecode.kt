package org.sp1k_e.leetCode.medium

// https://neetcode.io/problems/string-encode-and-decode
class StringEncodeDecode {
    companion object {
        private const val DELIMITER = "#"
    }

    fun encode(strs: List<String>): String {
        return strs.map { str -> str.length.toString() + DELIMITER + str }.joinToString("")
    }

    fun decode(str: String): List<String> {
        val result = mutableListOf<String>()
        var index = 0
        while (true) {
            val delimiterIndex = str.indexOf(DELIMITER, startIndex = index)
            if (delimiterIndex < 0) {
                break
            }

            val len = str.substring(index, delimiterIndex).toInt()
            index = delimiterIndex + 1
            result.add(str.substring(index, index + len))
            index += len
        }

        return result
    }
}