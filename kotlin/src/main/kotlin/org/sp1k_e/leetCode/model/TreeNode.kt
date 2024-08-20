package org.sp1k_e.leetCode.model

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null

    override fun toString(): String = "TreeNode(`val`=$`val`, left=${left?.`val`}, right=${right?.`val`})"
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