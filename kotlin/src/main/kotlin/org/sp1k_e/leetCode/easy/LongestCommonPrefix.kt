package org.sp1k_e.leetCode.easy

// https://leetcode.com/problems/longest-common-prefix/
class LongestCommonPrefix {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) {
            return ""
        }
        var index = 0
        strs.sortBy { s -> s.length }
        while (index < strs.first().length) {
            var char: Char? = null
            for (str in strs) {
                if (char == null) {
                    char = str.toCharArray()[index]
                } else if (char != str.toCharArray()[index]) {
                    char = null
                    break
                }
            }
            if (char == null) {
                break
            }
            index++
        }
        return strs.first().substring(0..<index)
    }
}