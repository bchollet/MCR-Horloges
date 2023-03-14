package ui.layouts;

import ui.chronometer.ChronometerUI;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public abstract class AllChronoLayoutUI extends JPanel {
    protected List<ChronometerUI> chronometerUIs;

    /**
     * Creates a layout containing multiple ChronometerUIs disposed in a Flowlayout fashion
     */
    protected AllChronoLayoutUI() {
        chronometerUIs = new ArrayList<>();
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
    }

    /**
     * Unsubscribes from all observables for each ChronometerUI
     */
    public void unsusbcribeAllSubjects() {
        for(ChronometerUI c : chronometerUIs) {
            c.unsubscribeSubject();
        }
    }
}
