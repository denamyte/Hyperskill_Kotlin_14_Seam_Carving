package seamcarving

import java.awt.Color
import kotlin.math.max
import kotlin.math.sqrt

typealias Energies = Array<Array<Double>>

class Energizer(private val rgbMtx: RGBMatrix) {
    private val emptyEnergies get() = Array(rgbMtx.width) { Array(rgbMtx.height) {.0} }
    val normEnergies: Energies
    private var maxEnergy = .0

    init {
        val energies = calcEnergies()
        normEnergies = normalizeEnergies(energies)
    }

    private fun calcEnergies(): Energies =
        emptyEnergies.apply {
            for (x in 0 until rgbMtx.width)
                for (y in 0 until rgbMtx.height)
                    this[x][y] = energyFor(x, y).also {
                        maxEnergy = max(it, maxEnergy)
                    }
        }

    private fun energyFor(x: Int, y: Int): Double {
        val (xLT, xGT) = shiftedCrd(x, rgbMtx.width)
        val (yLT, yGT) = shiftedCrd(y, rgbMtx.height)
        val deltaX = deltaColor(
            rgbMtx.getColor(xLT, y),
            rgbMtx.getColor(xGT, y)
        )
        val deltaY = deltaColor(
            rgbMtx.getColor(x, yLT),
            rgbMtx.getColor(x, yGT)
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
            for (x in 0 until rgbMtx.width)
                for (y in 0 until rgbMtx.height)
                    this[x][y] = 255.0 * energies[x][y] / maxEnergy
        }
}