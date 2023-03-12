package ui.buttons;

import core.Chronometer;
import ui.chronometer.ChronometerNumUI;
import ui.layouts.AllChronoNumLayoutUI;

import java.util.List;

import static utils.ProgramConstant.NUM_CLOCK;

public class OpenChronoNumButton extends OpenChronoButton {
    public OpenChronoNumButton(Chronometer chronometer) {
        super(NUM_CLOCK);
        this.addActionListener(e -> super.createFrameWithChronometer(new ChronometerNumUI(chronometer)));
    }

    public OpenChronoNumButton(List<Chronometer> chronometers) {
        super(NUM_CLOCK);
        this.addActionListener(e -> super.createFrameWithLayout(new AllChronoNumLayoutUI(chronometers)));
    }
}
