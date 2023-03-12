package ui.buttons;

import core.Chronometer;

import javax.swing.*;

import static utils.ProgramConstant.START;

public class StartChronoButton extends JButton {
    public StartChronoButton(Chronometer chronometer) {
        super(START);
        this.addActionListener(e -> chronometer.start());
    }
}
