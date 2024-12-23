package org.sp1k_e.leetCode.medium

// https://leetcode.com/problems/evaluate-reverse-polish-notation/description/
class EvaluateReversePolishNotation {
    fun evalRPN(tokens: Array<String>): Int {
        val stack = ArrayDeque<Int>()
        val operators = setOf("+", "-", "*", "/")
        for (token in tokens) {
            if (token in operators) {
                val right = stack.removeLast()
                val left = stack.removeLast()
                stack.addLast(eval(left, right, token))
            } else {
                stack.addLast(token.toInt())
            }
        }
        return stack.removeLast()
    }

    private fun eval(left: Int, right: Int, operator: String): Int {
        return when (operator) {
            "+" -> left + right
            "-" -> left - right
            "*" -> left * right
            "/" -> left / right
            else -> throw IllegalArgumentException("Unknown operator: $operator")
        }
    }
}