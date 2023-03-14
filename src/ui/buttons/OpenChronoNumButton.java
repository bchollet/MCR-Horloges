package ui.buttons;

import core.Chronometer;
import ui.chronometer.ChronometerNumUI;
import ui.layouts.AllChronoNumLayoutUI;

import java.util.List;

public class OpenChronoNumButton extends OpenChronoButton {
    private static final String NUM_CLOCK = "Numérique";

    /**
     * A button that open a single numeric chronometer upon click
     * @param chronometer The Chronometer subject the UI will subscribe to
     */
    public OpenChronoNumButton(Chronometer chronometer) {
        super(NUM_CLOCK);
        this.addActionListener(e -> super.createFrameWithChronometer(new ChronometerNumUI(chronometer)));
    }

    /**
     * A button that open multiple numeric dial on a single JPanel upon click. One for each subject in the list
     * @param chronometers The list of Chronometer subjects each UI will subscribe to
     */
    public OpenChronoNumButton(List<Chronometer> chronometers) {
        super(NUM_CLOCK);
        this.addActionListener(e -> super.createFrameWithLayout(new AllChronoNumLayoutUI(chronometers)));
    }
}
