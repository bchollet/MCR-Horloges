package ui.chronometer;

import core.Chronometer;
import utils.TimeFormatter;

import javax.swing.*;
import java.awt.*;

public class ChronometerNumUI extends ChronometerUI{
    public ChronometerNumUI(Chronometer chronometer) {
        super(chronometer);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Rectangle rect = SwingUtilities.calculateInnerArea(this, null); //TODO: Constante à mettre dans la classe abstraite
        String chronometerStr = "Chrono #" + getId() + " " + TimeFormatter.formatTime(getSeconds());
        g.drawString(chronometerStr, (int)rect.getCenterX() - 70, (int) rect.getCenterY());
    }
}
