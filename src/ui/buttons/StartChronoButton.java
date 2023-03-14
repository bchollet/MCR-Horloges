package ui.buttons;

import core.Chronometer;

import javax.swing.*;

public class StartChronoButton extends JButton {
    private static final String START = "Démarrer";

    /**
     * Send signal to start chronometer task on click
     * @param chronometer Affected Timer
     */
    public StartChronoButton(Chronometer chronometer) {
        super(START);
        this.addActionListener(e -> chronometer.start());
    }
}
