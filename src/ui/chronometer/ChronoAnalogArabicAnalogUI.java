package ui.chronometer;

import core.Chronometer;

import java.awt.*;

public class ChronoAnalogArabicAnalogUI extends ChronometerAnalogUI {
    private static final String ARABIC_DIAL_FILE = "cadran_chiffres_arabes.jpg";

    /**
     * Creates a visual representation of analog chronometer with a arabic dial
     * @param chronometer observable the UI subscribes to
     */
    public ChronoAnalogArabicAnalogUI(Chronometer chronometer) {
        super(chronometer, ARABIC_DIAL_FILE, Color.BLUE, Color.RED);
    }
}
