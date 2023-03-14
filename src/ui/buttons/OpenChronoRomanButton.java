package ui.buttons;

import core.Chronometer;
import ui.chronometer.ChronoAnalogRomanAnalogUI;
import ui.layouts.AllChronoRomanLayoutUI;

import java.util.List;

public class OpenChronoRomanButton extends OpenChronoButton {
    private static final String ROMAN_CLOCK = "Cadran romain";

    /**
     * A button that open a single arabic dial upon click
     * @param chronometer The Chronometer subject the UI will subscribe to
     */
    public OpenChronoRomanButton(Chronometer chronometer) {
        super(ROMAN_CLOCK);
        this.addActionListener(e -> super.createFrameWithChronometer(new ChronoAnalogRomanAnalogUI(chronometer)));
    }

    /**
     * A button that open multiple roman dial on a single JPanel upon click. One for each subject in the list
     * @param chronometers The list of Chronometer subjects each UI will subscribe to
     */
    public OpenChronoRomanButton(List<Chronometer> chronometers) {
        super(ROMAN_CLOCK);
        this.addActionListener(e -> super.createFrameWithLayout(new AllChronoRomanLayoutUI(chronometers)));
    }
}
