package org.sp1k_e.leetCode.hard

// https://leetcode.com/problems/regular-expression-matching/
class RegularExpressionMatching {
    fun isMatch(s: String, p: String): Boolean {
        val simplifiedP = StringBuilder()
        for (i in 0..p.lastIndex) {
            if (i == 0 || p[i] != '*' || p[i - 1] != '*') {
                simplifiedP.append(p[i])
            }
        }
        return hasMatch(s, simplifiedP.toString())
    }

    private fun hasMatch(s: String, p: String): Boolean {
        if (p.isEmpty()) {
            return s.isEmpty()
        }

        val firstMatch = s.isNotEmpty() && (s.first() == p.first() || p.first() == '.')

        if (p.length > 1 && p[1] == '*') {
            return hasMatch(s, p.substring(2)) ||
                    (firstMatch && hasMatch(s.substring(1), p))
        }

        return firstMatch && hasMatch(s.substring(1), p.substring(1))
    }
}