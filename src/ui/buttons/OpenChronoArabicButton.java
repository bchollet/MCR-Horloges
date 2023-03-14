package ui.buttons;

import core.Chronometer;
import ui.chronometer.ChronoAnalogArabicAnalogUI;
import ui.layouts.AllChronoArabicLayoutUI;

import java.util.List;

public class OpenChronoArabicButton extends OpenChronoButton {
    private static final String ARABIC_CLOCK = "Cadran arabe";

    /**
     * A button that open a single arabic dial upon click
     * @param chronometer The Chronometer subject the UI will subscribe to
     */
    public OpenChronoArabicButton(Chronometer chronometer) {
        super(ARABIC_CLOCK);
        this.addActionListener(e -> super.createFrameWithChronometer(new ChronoAnalogArabicAnalogUI(chronometer)));
    }

    /**
     * A button that open multiple arabic dial on a single JPanel upon click. One for each subject in the list
     * @param chronometers The list of Chronometer subjects each UI will subscribe to
     */
    public OpenChronoArabicButton(List<Chronometer> chronometers) {
        super(ARABIC_CLOCK);
        this.addActionListener(e -> super.createFrameWithLayout(new AllChronoArabicLayoutUI(chronometers)));
    }
}
