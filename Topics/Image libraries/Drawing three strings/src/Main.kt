import java.awt.Color
import java.awt.image.BufferedImage

const val TEXT = "Hello, images!"
const val SIZE = 200
val colors = mapOf(
    50 to Color.RED,
    51 to Color.GREEN,
    52 to Color.BLUE
)

fun drawStrings(): BufferedImage =
    BufferedImage(SIZE, SIZE, BufferedImage.TYPE_INT_RGB).apply {
        graphics.apply {
            colors.forEach { (crd, clr) ->
                color = clr
                drawString(TEXT, crd, crd)
            }
        }
    }