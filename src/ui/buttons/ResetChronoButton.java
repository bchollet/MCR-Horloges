package ui.buttons;

import core.Chronometer;

import javax.swing.*;

import static utils.ProgramConstant.RESET;

public class ResetChronoButton extends JButton {
    public ResetChronoButton(Chronometer chronometer) {
        super(RESET);
        this.addActionListener(e -> chronometer.reset());
    }
}
