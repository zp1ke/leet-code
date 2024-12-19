package org.sp1k_e.leetCode.easy

// https://leetcode.com/problems/valid-parentheses/description/
class ValidParentheses {
    fun isValid(s: String): Boolean {
        if (s.isEmpty()) {
            return true
        }

        var stack = ArrayDeque<Char>()
        var brackets = mapOf(
            ']' to '[',
            ')' to '(',
            '}' to '{',
        )
        for (char in s.toCharArray()) {
            if (brackets.containsKey(char)) {
                var openBracket = stack.removeLastOrNull()
                if (brackets[char] != openBracket) {
                    return false
                }
            } else {
                stack.addLast(char)
            }
        }
        return stack.isEmpty()
    }
}