package seamcarving

import java.awt.Color
import java.awt.image.BufferedImage
import kotlin.math.max
import kotlin.math.sqrt

typealias Energies = Array<Array<Double>>

class Energizer(private val image: BufferedImage) {
    private val emptyEnergies get() = Array(image.width) { Array(image.height) {.0} }
    val normEnergies: Energies
    private var maxEnergy = .0
    
    init {
        val energies = calcEnergies()
        normEnergies = normalizeEnergies(energies)
    }

    private fun calcEnergies(): Energies =
        emptyEnergies.apply {
            for (x in 0 until image.width)
                for (y in 0 until image.height)
                    this[x][y] = energyFor(x, y).also {
                        maxEnergy = max(it, maxEnergy)
                    }
        }

    private fun energyFor(x: Int, y: Int): Double {
        val (xLT, xGT) = shiftedCrd(x, image.width)
        val (yLT, yGT) = shiftedCrd(y, image.height)
        val deltaX = deltaColor(
            Color(image.getRGB(xLT, y)),
            Color(image.getRGB(xGT, y))
        )
        val deltaY = deltaColor(
            Color(image.getRGB(x, yLT)),
            Color(image.getRGB(x, yGT))
        )
        return sqrt(deltaX.toDouble() + deltaY)
    }

    private fun shiftedCrd(crd: Int, size: Int): Pair<Int, Int> {
        return when (crd) {
            0 -> 0 to 2
            size - 1 -> size - 3 to size - 1
            else -> crd - 1 to crd + 1
        }
    }

    private fun deltaColor(color1: Color, color2: Color): Int =
        listOf(
            color1.red - color2.red,
            color1.green - color2.green,
            color1.blue - color2.blue
        ).sumOf { it * it }

    private fun normalizeEnergies(energies: Energies): Energies =
        emptyEnergies.apply {
            for (x in 0 until image.width)
                for (y in 0 until image.height)
                    this[x][y] = 255.0 * energies[x][y] / maxEnergy
        }
}