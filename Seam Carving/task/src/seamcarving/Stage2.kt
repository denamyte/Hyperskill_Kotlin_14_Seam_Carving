package seamcarving

import java.io.File
import javax.imageio.ImageIO

class Stage2(
    private val inName: String,
    private val outName: String
) {
    fun run() {
        val inFile = File(inName)
        if (!inFile.exists()) throw IllegalArgumentException("The file \"$inName\" does not exist!")
        val image = ImageIO.read(inFile)!!

        for (x in 0 until image.width)
            for (y in 0 until image.height)
                image.setRGB(x, y, 0xFFFFFF - image.getRGB(x, y))

        val outFile = File(outName)
        ImageIO.write(image, outFile.extension, outFile)
    }
}