package ui.chronometer;

import core.Chronometer;

import java.awt.*;

public class ChronoAnalogRomanAnalogUI extends ChronometerAnalogUI {
    private static final String ROMAN_DIAL_FILE = "cadran_chiffres_romains.jpg";

    /**
     * Creates a visual representation of analog chronometer with a roman dial
     * @param chronometer observable the UI subscribes to
     */
    public ChronoAnalogRomanAnalogUI(Chronometer chronometer) {
        super(chronometer, ROMAN_DIAL_FILE, Color.GRAY, Color.ORANGE);
    }
}
