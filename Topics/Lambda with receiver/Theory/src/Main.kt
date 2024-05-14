// You can experiment here, it won’t be checked

@DslMarker
annotation class TreeNodeDslMarker

@TreeNodeDslMarker
data class TreeNode(val value: String) {
    val children = mutableListOf<TreeNode>()

    fun addChild(child: TreeNode) {
        children.add(child)
    }
}

class TreeNodeBuilder {
    private val root = TreeNode("")
    private var currentNode = root

    fun value(value: String) {
        currentNode = TreeNode(value)
        root.addChild(currentNode)
    }

    fun child(block: TreeNodeBuilder.() -> Unit) {
        val childBuilder = TreeNodeBuilder()
        childBuilder.block()
        currentNode.addChild(childBuilder.build())
    }

    fun build(): TreeNode {
        return root
    }
}

fun buildTree(block: TreeNodeBuilder.() -> Unit): TreeNode {
    val builder = TreeNodeBuilder()
    builder.block()
    return builder.build()
}

fun main() {
    val tree = buildTree {
        value("Root")
        child {
            value("Child 1")
            child {
                value("Grandchild 1.1")
            }
            child {
                value("Grandchild 1.2")
            }
        }
        child {
            value("Child 2")
            child {
                value("Grandchild 2.1")
            }
        }
    }

    printTree(tree)
}

fun printTree(node: TreeNode, level: Int = 0) {
    val indentation = "  ".repeat(level)
    println("$indentation${node.value}")
    for (child in node.children) {
        printTree(child, level + 1)
    }
}


