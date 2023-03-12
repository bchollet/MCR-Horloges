package ui;

import core.Chronometer;
import ui.layouts.AllChronoControlsLayoutUI;
import ui.layouts.ChronoControlsLayoutUI;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ControlPanelUI extends JPanel {
    List<Chronometer> chronometers;
    public ControlPanelUI(int nbChono) {
        chronometers = new ArrayList<>();
        this.setLayout(new GridLayout(nbChono + 1, 1));

        for (int i = 0; i < nbChono; i++) {
            Chronometer chronometer = new Chronometer();
            this.add(new ChronoControlsLayoutUI(chronometer));
            this.chronometers.add(chronometer);
        }

        this.add(new AllChronoControlsLayoutUI(chronometers));
    }
}
