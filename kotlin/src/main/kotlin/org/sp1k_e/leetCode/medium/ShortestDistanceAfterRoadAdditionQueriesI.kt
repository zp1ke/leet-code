package org.sp1k_e.leetCode.medium

// https://leetcode.com/problems/shortest-distance-after-road-addition-queries-i/description/
class ShortestDistanceAfterRoadAdditionQueriesI {
    fun shortestDistanceAfterQueries(n: Int, queries: Array<IntArray>): IntArray {
        val graph = MutableList(n - 1) { i -> intArrayOf(i, i + 1) }
        val nodesDistances = IntArray(n) { i -> if (i == 0) 0 else Int.MAX_VALUE }
        val visited = BooleanArray(n) { i -> i == 0 }

        val queue = ArrayDeque<Int>()
        queue.add(0)

        if (queries.isNotEmpty()) {
            graph.add(queries.first())
        }
        while (queue.isNotEmpty()) {
            val vertex = queue.removeFirst()
            val vertexNeighbors = graph.filter { arr -> arr.first() == vertex }.map { arr -> arr.last() }
            for (neighbor in vertexNeighbors) {
                if (!visited[neighbor]) {
                    nodesDistances[neighbor] = nodesDistances[vertex] + 1
                    visited[neighbor] = true
                    queue.add(neighbor)
                }
            }
        }
        val distances = IntArray(queries.size) { i -> if (i == 0) nodesDistances[n - 1] else 0 }

        for (queryIndex in 1..queries.lastIndex) {
            val query = queries[queryIndex]
            graph.add(query)
            queue.add(query.first())
            while (queue.isNotEmpty()) {
                val vertex = queue.removeFirst()
                val vertexNeighbors =
                    if (vertex == query.first()) listOf(query.last()) else graph.filter { arr -> arr.first() == vertex }
                        .map { arr -> arr.last() }
                for (neighbor in vertexNeighbors) {
                    val newDistance = nodesDistances[vertex] + 1
                    if (newDistance < nodesDistances[neighbor]) {
                        nodesDistances[neighbor] = newDistance
                        queue.add(neighbor)
                    }
                }
            }
            distances[queryIndex] = nodesDistances[n - 1]
        }

        return distances
    }
}