package ui.layouts;

import core.Chronometer;
import ui.buttons.OpenChronoArabicButton;
import ui.buttons.OpenChronoNumButton;
import ui.buttons.OpenChronoRomanButton;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class AllChronoControlsLayoutUI extends JPanel {
    private static final String ALL_CHRONO = "Tous les chronos";

    /**
     * A layout containing all buttons to open a new panel with all visual representation of a chronometer,
     * one for each chronometer subject
     * @param chronometers a list of chronometer subject
     */
    public AllChronoControlsLayoutUI(List<Chronometer> chronometers) {
        this.setLayout(new FlowLayout(FlowLayout.RIGHT));

        this.add(new JLabel(ALL_CHRONO));
        this.add(new OpenChronoRomanButton(chronometers));
        this.add(new OpenChronoArabicButton(chronometers));
        this.add(new OpenChronoNumButton(chronometers));
    }
}
