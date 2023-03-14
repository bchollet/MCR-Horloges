package ui;

import core.Chronometer;
import ui.layouts.AllChronoControlsLayoutUI;
import ui.layouts.ChronoControlsLayoutUI;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ControlPanelUI extends JPanel {

    /**
     * A panel containing all buttons to manage all given chronometers
     * @param nbChono number of chronometers to manage
     */
    public ControlPanelUI(int nbChono) {
        List<Chronometer> chronometers = new ArrayList<>();
        this.setLayout(new GridLayout(nbChono + 1, 1));

        for (int i = 0; i < nbChono; i++) {
            Chronometer chronometer = new Chronometer();
            this.add(new ChronoControlsLayoutUI(chronometer));
            chronometers.add(chronometer);
        }

        this.add(new AllChronoControlsLayoutUI(chronometers));
    }
}
