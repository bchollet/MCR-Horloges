package ui.buttons;

import core.Chronometer;
import ui.chronometer.ChronoAnalogArabicAnalogUI;
import ui.layouts.AllChronoArabicLayoutUI;

import java.util.List;

import static utils.ProgramConstant.ARABIC_CLOCK;

public class OpenChronoArabicButton extends OpenChronoButton {
    public OpenChronoArabicButton(Chronometer chronometer) {
        super(ARABIC_CLOCK);
        this.addActionListener(e -> super.createFrameWithChronometer(new ChronoAnalogArabicAnalogUI(chronometer)));
    }

    public OpenChronoArabicButton(List<Chronometer> chronometers) {
        super(ARABIC_CLOCK);
        this.addActionListener(e -> super.createFrameWithLayout(new AllChronoArabicLayoutUI(chronometers)));
    }
}
