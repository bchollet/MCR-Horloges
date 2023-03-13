package ui.buttons;

import ui.chronometer.ChronometerUI;
import ui.layouts.AllChronoLayoutUI;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public abstract class OpenChronoButton extends JButton {
    protected OpenChronoButton(String label) {
        super(label);
    }
    protected void createFrameWithChronometer(ChronometerUI chronometerUi) {
        JFrame frame = new JFrame();
        frame.add(chronometerUi);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                chronometerUi.unsubscribeSubject();
            }
        });
        setupFrame(frame, false);
    }

    protected void createFrameWithLayout(AllChronoLayoutUI allChronoLayoutUI) {
        JFrame frame = new JFrame();
        frame.add(allChronoLayoutUI);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                allChronoLayoutUI.unsusbcribeAllSubjects();
            }
        });
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
