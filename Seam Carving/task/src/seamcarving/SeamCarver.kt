package seamcarving

import kotlin.math.max
import kotlin.math.min

class SeamCarver(private var energies: Energies, val isDownward: Boolean) {

    companion object {
        class SeamNode(
            isDownward: Boolean,
            x: Int, y: Int,
            energy: Double,
            vararg cells: SeamNode
        ) {
            val x = if (isDownward) x else y
            val y = if (isDownward) y else x
            val prevCell: SeamNode? = cells.minByOrNull { it.energySum }
            val energySum: Double = energy + (prevCell?.energySum ?: .0)

            override fun toString() = "($x, $y) -> $energySum"
        }
    }

    fun carve(): List<Pair<Int, Int>> {
        val maxRowIndex = when (isDownward) {
            true -> energies[0].size
            false -> energies.size
        }
        var lastSeamNodes = getRow(0)
            .mapIndexed { x, energy -> SeamNode(isDownward, x, 0, energy) }

        for (rowIndex in 1 until maxRowIndex) {
            lastSeamNodes = getRow(rowIndex).mapIndexed { i, en ->
                val upperSeamNodes = lastSeamNodes.subList(
                    max(0, i - 1),
                    min(i + 2, lastSeamNodes.size)
                ).toTypedArray()
                SeamNode(isDownward, i, rowIndex, en, *upperSeamNodes)
            }
        }
        var minNode: SeamNode? = lastSeamNodes.minByOrNull { it.energySum }
        val crdList = mutableListOf<Pair<Int, Int>>()
        while (minNode != null) {
            crdList.add(Pair(minNode.x, minNode.y))
            minNode = minNode.prevCell
        }
        return crdList.reversed()
    }

    private fun getRow(rowIndex: Int): Array<Double> {
        return when (isDownward) {
            true -> energies.map { it[rowIndex] }.toTypedArray()
            false -> energies[rowIndex]
        }
    }
}