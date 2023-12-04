import java.awt.Color
import java.awt.image.BufferedImage

val lines = mapOf(
    Pair(Pair(0, 0), Pair(200, 200)) to Color.RED,
    Pair(Pair(200, 0), Pair(0, 200)) to Color.GREEN,
)

fun drawLines(): BufferedImage =
    BufferedImage(200, 200, BufferedImage.TYPE_INT_RGB).apply {
        graphics.apply {
            lines.forEach { (crd, clr) ->
                val (x1, y1) = crd.first
                val (x2, y2) = crd.second
                color = clr
                drawLine(x1, y1, x2, y2)
            }
        }
    }