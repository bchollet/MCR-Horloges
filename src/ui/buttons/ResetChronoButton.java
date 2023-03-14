package ui.buttons;

import core.Chronometer;

import javax.swing.*;

public class ResetChronoButton extends JButton {
    private static final String RESET = "Réinitialiser";

    /**
     * Send signal to stop chronometer task on click
     * @param chronometer Affected Timer
     */
    public ResetChronoButton(Chronometer chronometer) {
        super(RESET);
        this.addActionListener(e -> chronometer.reset());
    }
}
