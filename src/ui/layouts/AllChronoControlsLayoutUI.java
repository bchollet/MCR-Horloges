package ui.layouts;

import core.Chronometer;
import ui.buttons.OpenChronoArabicButton;
import ui.buttons.OpenChronoNumButton;
import ui.buttons.OpenChronoRomanButton;

import javax.swing.*;
import java.awt.*;
import java.util.List;

import static utils.ProgramConstant.ALL_CHRONO;


public class AllChronoControlsLayoutUI extends JPanel {
    public AllChronoControlsLayoutUI(List<Chronometer> chronometers) {
        this.setLayout(new FlowLayout(FlowLayout.RIGHT));

        this.add(new JLabel(ALL_CHRONO));
        this.add(new OpenChronoRomanButton(chronometers));
        this.add(new OpenChronoArabicButton(chronometers));
        this.add(new OpenChronoNumButton(chronometers));
    }
}
