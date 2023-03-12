package ui.chronometer;

import core.Chronometer;

import java.awt.*;

import static utils.ProgramConstant.ROMAN_DIAL_FILE;

public class ChronoAnalogRomanAnalogUI extends ChronometerAnalogUI {
    public ChronoAnalogRomanAnalogUI(Chronometer chronometer) {
        super(chronometer, ROMAN_DIAL_FILE, Color.GRAY, Color.ORANGE);
    }
}
