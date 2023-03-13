package ui.layouts;

import ui.chronometer.ChronometerUI;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public abstract class AllChronoLayoutUI extends JPanel {
    protected List<ChronometerUI> chronometerUIs;
    protected AllChronoLayoutUI() {
        chronometerUIs = new ArrayList<>();
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
    }
    public void unsusbcribeAllSubjects() {
        for(ChronometerUI c : chronometerUIs) {
            c.unsubscribeSubject();
        }
    }
}
