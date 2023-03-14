package ui.buttons;

import core.Chronometer;

import javax.swing.*;

public class StopChronoButton extends JButton {
    private static final String STOP = "Arrêter";

    /**
     * Send signal to start chronometer task on click
     * @param chronometer Affected Timer
     */
    public StopChronoButton(Chronometer chronometer) {
        super(STOP);
        this.addActionListener(e -> chronometer.stop());
    }
}
