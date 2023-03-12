package ui.buttons;

import core.Chronometer;

import javax.swing.*;

import static utils.ProgramConstant.STOP;

public class StopChronoButton extends JButton {
    public StopChronoButton(Chronometer chronometer) {
        super(STOP);
        this.addActionListener(e -> chronometer.stop());
    }
}
