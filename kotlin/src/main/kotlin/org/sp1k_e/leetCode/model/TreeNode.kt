package org.sp1k_e.leetCode.model

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null

    override fun toString(): String = "TreeNode(`val`=$`val`, left=${left?.`val`}, right=${right?.`val`})"

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as TreeNode

        return `val` == other.`val` &&
                left == other.left &&
                right == other.right
    }

    override fun hashCode(): Int {
        var result = `val`
        result = 31 * result + (left?.hashCode() ?: 0)
        result = 31 * result + (right?.hashCode() ?: 0)
        return result
    }
}

val Array<Int?>.asTreeNode: TreeNode?
    // https://dev.to/sibprogrammer/build-binary-tree-from-array-1f5o#approach-2
    get() {
        if (isEmpty() || first() == null) {
            return null
        }

        val list = toMutableList()
        val root = TreeNode(`val` = list.removeFirst()!!)
        val queue = mutableListOf(root)

        while (list.isNotEmpty()) {
            val node = queue.removeFirst()

            val left = if (list.isNotEmpty()) list.removeFirst() else null
            if (left != null) {
                node.left = TreeNode(`val` = left)
                queue.add(node.left!!)
            }

            val right = if (list.isNotEmpty()) list.removeFirst() else null
            if (right != null) {
                node.right = TreeNode(`val` = right)
                queue.add(node.right!!)
            }
        }

        return root
    }