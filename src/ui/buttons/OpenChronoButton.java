package ui.buttons;

import ui.chronometer.ChronometerUI;
import ui.layouts.AllChronoLayoutUI;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public abstract class OpenChronoButton extends JButton {
    /**
     * Creates a button with a given label
     * @param label Label shown on button
     */
    protected OpenChronoButton(String label) {
        super(label);
    }

    /**
     * Instantiates a JFrame containing a ChronometerUI. Sets frame to unsubscribe from Observable upon close
     * @param chronometerUi A visual representation of a chronometer
     */
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

    /**
     * Instantiates a JFrame containing a layout for multiple ChronometerUI.
     * Sets frame to unsubscribe from  all observables upon close
     * @param allChronoLayoutUI A layout that can contains multiple ChronometerUI
     */
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

    /**
     * Sets various specific settings on given JFrame
     * @param frame JFrame to set
     * @param resizeable True to allow resizeable frame
     */
    private void setupFrame(JFrame frame, boolean resizeable) {
        frame.setResizable(resizeable);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.repaint();
    }
}
