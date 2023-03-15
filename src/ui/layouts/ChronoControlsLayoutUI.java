package ui.layouts;

import core.Chronometer;
import ui.buttons.*;

import javax.swing.*;
import java.awt.*;

public class ChronoControlsLayoutUI extends JPanel {
    private static final String CHRONO = "Chrono #";

    /**
     * A layout containing all buttons to manage one chronometer subject and its visual representations
     * @param chronometer a chronometer subject
     */
    public ChronoControlsLayoutUI(Chronometer chronometer) {

        this.setLayout(new FlowLayout(FlowLayout.CENTER));

        this.add(new JLabel(CHRONO + chronometer.getId()));
        this.add(new StartChronoButton(chronometer));
        this.add(new StopChronoButton(chronometer));
        this.add(new ResetChronoButton(chronometer));
        this.add(new OpenChronoRomanButton(chronometer));
        this.add(new OpenChronoArabicButton(chronometer));
        this.add(new OpenChronoNumButton(chronometer));
    }
}
