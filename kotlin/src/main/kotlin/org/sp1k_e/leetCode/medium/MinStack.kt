package org.sp1k_e.leetCode.medium

// https://leetcode.com/problems/min-stack/description/
class MinStack {
    private val stack = mutableListOf<Int>()
    private var orderStack = mutableListOf<Int>()

    fun push(`val`: Int) {
        stack.add(`val`)
        addToOrder(`val`)
    }

    private fun addToOrder(value: Int) {
        var index = 0
        while (index < orderStack.size && orderStack[index] < value) {
            index++
        }
        orderStack.add(index, value)
    }

    fun pop() {
        val last = stack.removeLast()
        orderStack.remove(last)
    }

    fun top(): Int {
        return stack.last()
    }

    fun getMin(): Int {
        if (orderStack.isNotEmpty()) {
            return orderStack.first()
        }
        return Int.MIN_VALUE
    }
}