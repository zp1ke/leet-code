package org.sp1k_e.leetCode.medium

// https://neetcode.io/problems/three-integer-sum
class NCThreeIntegerSum {
    fun threeSum(nums: IntArray): List<List<Int>> {
        val numbers = nums.sorted()
        val result = mutableSetOf<List<Int>>()
        for (index in 0..numbers.lastIndex) {
            val triplets = findTriplets(numbers, index)
            result.addAll(triplets)
        }
        return result.toList()
    }

    private fun findTriplets(numbers: List<Int>, index: Int): List<List<Int>> {
        var left = index + 1
        var right = numbers.lastIndex
        val targetSum = -numbers[index]
        val triplets = mutableSetOf<List<Int>>()
        while (left < right) {
            val sum = numbers[left] + numbers[right]
            if (sum == targetSum) {
                triplets.add(listOf(-targetSum, numbers[left], numbers[right]))
                right--
                left++
            } else if (sum > targetSum) {
                right--
            } else {
                left++
            }
        }
        return triplets.toList()
    }
}