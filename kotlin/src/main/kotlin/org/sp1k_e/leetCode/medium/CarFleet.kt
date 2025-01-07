package org.sp1k_e.leetCode.medium

// https://leetcode.com/problems/car-fleet/description/
class CarFleet {
    fun carFleet(target: Int, position: IntArray, speed: IntArray): Int {
        val cars = Array(position.size) { index -> Car(position = position[index], speed = speed[index]) }
        cars.sortByDescending { car -> car.position }

        var fleets = 1
        var currentTargetTime = cars.first().targetTime(target)

        for (index in 1..cars.lastIndex) {
            var targetTime = cars[index].targetTime(target)
            if (targetTime > currentTargetTime) {
                fleets += 1
                currentTargetTime = targetTime
            }
        }

        return fleets
    }

    private class Car(val position: Int, val speed: Int) {
        fun targetTime(target: Int): Double {
            return (target - position).toDouble() / speed
        }
    }
}