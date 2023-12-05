package seamcarving

import java.awt.Color
import java.awt.image.BufferedImage
import java.io.File
import javax.imageio.ImageIO
import kotlin.math.sqrt

private fun Int.toColor() = Color(this)

class Stage3(
    private val inName: String,
    private val outName: String
) {
    private val image: BufferedImage
    private val energies: Array<Array<Double>>
    private var maxEnergy = .0

    companion object {
        val SHADES_OF_GRAY: Map<Int, Int> = (0..255)  // 256 shades of gray  :))
            .associateWith { Color(it, it, it).rgb }
    }

    init {
        val inFile = File(inName)
        if (!inFile.exists())
            throw IllegalArgumentException("The file \"$inName\" does not exist!")
        image = ImageIO.read(inFile)
        energies = Array(image.width) { Array(image.height) {.0} }

    }

    fun run() {
        val inFile = File(inName)
        if (!inFile.exists())
            throw IllegalArgumentException("The file \"$inName\" does not exist!")
        val image = ImageIO.read(inFile)!!
        val width = image.width
        val height = image.height

        for (x in 0 until width) {
            for (y in 0 until height) {
                energies[x][y] = energy(x, y).also {
                    if (it > maxEnergy) maxEnergy = it
                }
            }
        }

        val outImage = normalizeEnergies()
        val outFile = File(outName)
        ImageIO.write(outImage, outFile.extension, outFile)
    }

    private fun energy(x: Int, y: Int): Double {
        val (xLT, xGT) = shiftedCrd(x, image.width)
        val (yLT, yGT) = shiftedCrd(y, image.height)
        val deltaX = deltaColor(
            image.getRGB(xLT, y).toColor(),
            image.getRGB(xGT, y).toColor()
        )
        val deltaY = deltaColor(
            image.getRGB(x, yLT).toColor(),
            image.getRGB(x, yGT).toColor()
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

    private fun normalizeEnergies(): BufferedImage {
        val outImage = BufferedImage(image.width, image.height, BufferedImage.TYPE_INT_RGB)
        for (x in 0 until image.width) {
            for (y in 0 until image.height) {
                val intensity = (255.0 * energies[x][y] / maxEnergy).toInt()
                outImage.setRGB(x, y, SHADES_OF_GRAY[intensity]!!)
            }
        }
        return outImage
    }
}