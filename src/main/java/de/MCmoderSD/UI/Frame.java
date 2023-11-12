package de.MCmoderSD.UI;

import de.MCmoderSD.main.Main;
import de.MCmoderSD.utilities.ImageReader;
import de.MCmoderSD.utilities.ImageStreamer;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("FieldCanBeLocal")
public class Frame extends JFrame {

    // Variables
    private static final Dimension SCREEN_SIZE = Toolkit.getDefaultToolkit().getScreenSize();
    // Utilities
    private final ImageReader imageReader;
    private final ImageStreamer imageStreamer;

    public Frame() {
        super(Main.TITLE);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(true);

        imageReader = new ImageReader();
        imageStreamer = new ImageStreamer();

        UI ui = new UI(imageReader, imageStreamer);
        ui.setPreferredSize(Main.SIZE);
        add(ui);

        pack();
        setLocation((SCREEN_SIZE.width - getWidth()) / 2, (SCREEN_SIZE.height - getHeight()) / 2);
        setVisible(true);
    }
}
