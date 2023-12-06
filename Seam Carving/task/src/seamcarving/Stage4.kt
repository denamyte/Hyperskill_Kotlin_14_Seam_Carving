package seamcarving

import java.awt.Color
import java.awt.image.BufferedImage
import java.io.File
import javax.imageio.ImageIO

class Stage4(
    inName: String,
    private val outName: String
) {
    private val image: BufferedImage
    private val energizer: Energizer

    init {
        val inFile = File(inName)
        if (!inFile.exists())
            throw IllegalArgumentException("The file \"$inName\" does not exist!")
        image = ImageIO.read(inFile)
        energizer = Energizer(image)
    }

    fun run() {
        val carver = SeamCarver(energizer.normEnergies, true)
        val crdList = carver.carve()
        val red = Color.RED.rgb
        crdList.forEach { (x, y) -> image.setRGB(x, y, red) }

        println(crdList.joinToString("\n"))
        val outFile = File(outName)
        ImageIO.write(image, outFile.extension, outFile)
    }
}