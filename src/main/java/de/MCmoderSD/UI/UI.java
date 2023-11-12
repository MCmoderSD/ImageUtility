package de.MCmoderSD.UI;

import de.MCmoderSD.utilities.ImageReader;
import de.MCmoderSD.utilities.ImageStreamer;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("ALL")
public class UI extends JPanel {

    // Utilities
    private final ImageReader imageReader;
    private final ImageStreamer imageStreamer;

    // Constructor
    public UI(ImageReader imageReader, ImageStreamer imageStreamer) {
        super();
        setLayout(null);
        setOpaque(true);
        setBackground(null);
        setBorder(null);
        setFocusable(true);
        setDoubleBuffered(true);
        setRequestFocusEnabled(true);

        this.imageReader = imageReader;
        this.imageStreamer = imageStreamer;
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);

        Graphics2D g = (Graphics2D) graphics;
    }
}
