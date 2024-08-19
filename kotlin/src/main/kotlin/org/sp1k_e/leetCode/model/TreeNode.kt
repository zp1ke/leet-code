package org.sp1k_e.leetCode.model

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null

    companion object {
        fun create(index: Int, array: Array<Int?>): TreeNode? {
            if (index < array.size && array[index] != null) {
                val node = TreeNode(`val` = array[index]!!)
                node.left = create(2 * index + 1, array)
                node.right = create(2 * index + 2, array)
                return node
            }
            return null
        }
    }

    override fun toString(): String = "TreeNode(`val`=$`val`, left=${left?.`val`}, right=${right?.`val`})"
}

val Array<Int?>.asTreeNode: TreeNode?
    get() {
        if (isEmpty()) {
            return null
        }
        return TreeNode.create(0, this)
    }