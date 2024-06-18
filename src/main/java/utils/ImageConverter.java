package utils;

import javafx.embed.swing.SwingFXUtils;
import javafx.scene.image.Image;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class ImageConverter {

    public static Image convertToFxImage(BufferedImage image) {
        return SwingFXUtils.toFXImage(image, null);
    }

    public static BufferedImage scaleBufferedImage(BufferedImage img, int width, int height) {
        BufferedImage scaledImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = scaledImage.createGraphics();
        g2d.drawImage(img, 0, 0, width, height, null);
        g2d.dispose();
        return scaledImage;
    }
}
