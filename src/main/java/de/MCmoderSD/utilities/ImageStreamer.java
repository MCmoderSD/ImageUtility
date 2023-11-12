package de.MCmoderSD.utilities;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

@SuppressWarnings("unused")
public class ImageStreamer extends ImageUtility {
    @Override
    public BufferedImage read(String url) {
        if (!url.endsWith(".png") && !url.endsWith(".jpg") && !url.endsWith(".jpeg") && !url.endsWith(".gif"))
            throw new IllegalArgumentException("Unsupported image format: " + url); // Image format is not supported
        if (bufferedImageCache.containsKey(url))
            return bufferedImageCache.get(url); // Checks the cache for the image

        BufferedImage image = null;
        try {
            image = ImageIO.read(new URL(url));
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        // Null check
        if (image == null)
            throw new IllegalArgumentException("The image could not be loaded: " + url); // Image could not be loaded (Image is null

        // Add to cache
        bufferedImageCache.put(url, image);
        return image;
    }

    @Override
    public ImageIcon readGif(String url) {
        if (!url.endsWith(".gif"))
            throw new IllegalArgumentException("Unsupported image format: " + url); // Animation format is not supported
        if (imageIconCache.containsKey(url))
            return imageIconCache.get(url); // Checks the cache for the Animation

        ImageIcon imageIcon; // Load the Animation

        try {
            imageIcon = new ImageIcon(new URL(url));
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

        imageIconCache.put(url, imageIcon);
        return imageIcon;
    }
}
