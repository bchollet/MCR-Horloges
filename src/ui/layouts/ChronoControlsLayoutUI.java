package ui.layouts;

import core.Chronometer;
import ui.buttons.*;
import utils.ProgramConstant;

import javax.swing.*;
import java.awt.*;

public class ChronoControlsLayoutUI extends JPanel {
    Chronometer chronometer;
    public ChronoControlsLayoutUI(Chronometer chronometer) {
        this.chronometer = chronometer;

        this.setLayout(new FlowLayout(FlowLayout.CENTER));

        this.add(new JLabel(ProgramConstant.CHRONO + chronometer.getId()));
        this.add(new StartChronoButton(chronometer));
        this.add(new StopChronoButton(chronometer));
        this.add(new ResetChronoButton(chronometer));
        this.add(new OpenChronoRomanButton(chronometer));
        this.add(new OpenChronoArabicButton(chronometer));
        this.add(new OpenChronoNumButton(chronometer));
    }
}
