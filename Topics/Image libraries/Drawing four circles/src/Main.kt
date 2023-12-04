import java.awt.Color
import java.awt.Graphics
import java.awt.image.BufferedImage

fun drawCircles(): BufferedImage {
    val image = BufferedImage(200, 200, BufferedImage.TYPE_INT_RGB)
    val graphics = image.createGraphics()
    draw(graphics, 50, 50, Color.RED)
    draw(graphics, 50, 75, Color.YELLOW)
    draw(graphics, 75, 50, Color.GREEN)
    draw(graphics, 75, 75, Color.BLUE)

    return image
}

fun draw(graphics: Graphics, x: Int, y: Int, color: Color) {
    graphics.color = color
    graphics.drawOval(x, y, 100, 100)
}