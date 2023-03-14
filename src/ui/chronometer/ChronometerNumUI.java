package ui.chronometer;

import core.Chronometer;
import utils.TimeFormatter;

import javax.swing.*;
import java.awt.*;

public class ChronometerNumUI extends ChronometerUI{

    /**
     * Constructs a visual representation of a numeric chronometer. Subscribes to a given chronometer
     * toggle chronometer task on click
     * @param chronometer Observable chronometer the UI subscribes to
     */
    public ChronometerNumUI(Chronometer chronometer) {
        super(chronometer);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Rectangle rect = SwingUtilities.calculateInnerArea(this, null);
        String chronometerStr = "Chrono #" + getId() + " " + TimeFormatter.formatTime(getSeconds());
        g.drawString(chronometerStr, (int)rect.getCenterX() - 70, (int) rect.getCenterY());
    }
}
