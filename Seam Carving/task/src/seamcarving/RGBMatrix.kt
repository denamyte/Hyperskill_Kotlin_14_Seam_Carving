package seamcarving

import java.awt.Color
import java.awt.image.BufferedImage

/**
 * A matrix containing color information of an image.
 */
class RGBMatrix(image: BufferedImage) {
    private var mtx: MutableList<MutableList<Color>>
    val width get() = mtx.size
    val height get() = mtx[0].size

    val asImage: BufferedImage get() =
        BufferedImage(width, height, BufferedImage.TYPE_INT_RGB).apply {
            for (x in 0 until width) {
                for (y in 0 until height)
                    setRGB(x, y, mtx[x][y].rgb)
            }
        }

    init {
        mtx = (0 until image.width).map { x ->
            (0 until image.height).map { y -> Color(image.getRGB(x, y)) }.toMutableList()
        }.toMutableList()
    }

    fun getColor(x: Int, y: Int) = mtx[x][y]

    fun removeSeam(isVertical: Boolean, seamData: List<Pair<Int, Int>>) {
        when (isVertical) {
            true ->
                seamData.forEach { (x, y) ->
                    for (x1 in x until mtx.lastIndex) {
                        mtx[x1][y] = mtx[x1 + 1][y]
                    }
                }.also { with(mtx) { removeAt(lastIndex) } }
            false -> seamData.forEach { (x, y) -> mtx[x].removeAt(y) }
        }
    }
}