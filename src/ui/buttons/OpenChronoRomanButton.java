package ui.buttons;

import core.Chronometer;
import ui.chronometer.ChronoAnalogRomanAnalogUI;
import ui.layouts.AllChronoRomanLayoutUI;

import java.util.List;

import static utils.ProgramConstant.ROMAN_CLOCK;

public class OpenChronoRomanButton extends OpenChronoButton {
    public OpenChronoRomanButton(Chronometer chronometer) {
        super(ROMAN_CLOCK);
        this.addActionListener(e -> super.createFrameWithChronometer(new ChronoAnalogRomanAnalogUI(chronometer)));
    }

    public OpenChronoRomanButton(List<Chronometer> chronometers) {
        super(ROMAN_CLOCK);
        this.addActionListener(e -> super.createFrameWithLayout(new AllChronoRomanLayoutUI(chronometers)));
    }
}
