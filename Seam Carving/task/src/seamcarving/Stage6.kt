package seamcarving

import java.io.File
import javax.imageio.ImageIO

class Stage6(
    inName: String,
    private val outName: String,
    private val vertNumber: Int,
    private val horzNumber: Int,
) {
    private val rgbMatrix: RGBMatrix

    init {
        val inFile = File(inName)
        if (!inFile.exists())
            throw IllegalArgumentException("The file \"$inName\" does not exist!")
        rgbMatrix = RGBMatrix(ImageIO.read(inFile))
    }

    fun run() {
        repeat(vertNumber) { oneSeamAway(true) }
        repeat(horzNumber) { oneSeamAway(false) }

        val outFile = File(outName)
        ImageIO.write(rgbMatrix.asImage, outFile.extension, outFile)
    }

    private fun oneSeamAway(isVertical: Boolean) {
        val energizer = Energizer(rgbMatrix)
        val carver = SeamCarver(energizer.normEnergies, isVertical)
        val crdList = carver.carve()
        rgbMatrix.removeSeam(isVertical, crdList)
    }
}