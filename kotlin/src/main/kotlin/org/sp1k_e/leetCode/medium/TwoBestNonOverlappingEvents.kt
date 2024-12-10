package org.sp1k_e.leetCode.medium

// https://leetcode.com/problems/two-best-non-overlapping-events/description/
class TwoBestNonOverlappingEvents {
    fun maxTwoEvents(events: Array<IntArray>): Int {
        val sortedEvents = events.sortedWith(compareBy { it[0] })

        val bestValueFrom = IntArray(events.size)
        for (index in sortedEvents.indices.reversed()) {
            val value = sortedEvents[index][2]
            if (index == sortedEvents.lastIndex) {
                bestValueFrom[index] = value
            } else {
                bestValueFrom[index] = maxOf(bestValueFrom[index + 1], value)
            }
        }

        var sum = 0
        for (event in sortedEvents) {
            val nextEventIndex = findNextBestEventIndexStartingAfter(sortedEvents, event[1])
            var value = event[2]
            if (nextEventIndex >= 0) {
                value += bestValueFrom[nextEventIndex]
            }
            sum = maxOf(sum, value)
        }

        return sum
    }

    private fun findNextBestEventIndexStartingAfter(events: List<IntArray>, endingAfter: Int): Int {
        var left = 0
        var right = events.size
        while (left < right) {
            val mid = left + ((right - left) / 2)
            if (events[mid][0] > endingAfter) {
                right = mid
            } else {
                left = mid + 1
            }
        }

        if (left < events.size && events[left][0] > endingAfter) {
            return left
        }
        return -1
    }
}