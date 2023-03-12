package ui.chronometer;

import core.Chronometer;

import java.awt.*;

import static utils.ProgramConstant.ARABIC_DIAL_FILE;

public class ChronoAnalogArabicAnalogUI extends ChronometerAnalogUI {
    public ChronoAnalogArabicAnalogUI(Chronometer chronometer) {
        super(chronometer, ARABIC_DIAL_FILE, Color.BLUE, Color.RED);
    }
}
