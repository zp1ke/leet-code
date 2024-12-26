package org.sp1k_e.leetCode.medium

// https://leetcode.com/problems/generate-parentheses/description/
class GenerateParentheses {
    fun generateParenthesis(n: Int): List<String> {
        val result = mutableListOf<String>()
        generate(0, 0, n, mutableListOf(), result)
        return result
    }

    private fun generate(open: Int, closed: Int, max: Int, data: List<String>, result: MutableList<String>) {
        if (closed == max) {
            result.add(data.joinToString(""))
            return
        }

        if (open < max) {
            val nextData = mutableListOf<String>()
            nextData.addAll(data)
            nextData.add("(")
            generate(open + 1, closed, max, nextData, result)
            nextData.removeLast()
        }

        if (closed < open) {
            val nextData = mutableListOf<String>()
            nextData.addAll(data)
            nextData.add(")")
            generate(open, closed + 1, max, nextData, result)
            nextData.removeLast()
        }
    }
}