package ui.buttons;

import ui.chronometer.ChronometerUI;
import ui.layouts.AllChronoLayoutUI;

import javax.swing.*;

public abstract class OpenChronoButton extends JButton {
    protected OpenChronoButton(String label) {
        super(label);
    }
    protected void createFrameWithChronometer(ChronometerUI chronometerUi) {
        JFrame frame = new JFrame();
        frame.add(chronometerUi);
        setupFrame(frame, false);
    }

    protected void createFrameWithLayout(AllChronoLayoutUI allChronoLayoutUI) {
        JFrame frame = new JFrame();
        frame.add(allChronoLayoutUI);
        setupFrame(frame, true);
    }

    private void setupFrame(JFrame frame, boolean resizeable) {
        frame.setResizable(resizeable);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.repaint();
    }
}
