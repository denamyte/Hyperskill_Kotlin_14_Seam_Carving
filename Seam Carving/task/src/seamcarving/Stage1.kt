package seamcarving

import java.awt.Color
import java.awt.image.BufferedImage
import java.io.File
import javax.imageio.ImageIO

class Stage1(
    private val width: Int,
    private val height: Int,
    private val name: String
) {
    fun run() =
        BufferedImage(width, height, BufferedImage.TYPE_INT_RGB).run {
            graphics.run {
                color = Color.RED
                drawLine(0, 0, width - 1, height - 1)
                drawLine(0, height - 1, width - 1, 0)
            }
            val format = name.substring(name.indexOf('.') + 1)
            ImageIO.write(this, "png", File(name))
        }
    }
