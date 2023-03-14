package ui;

import javax.swing.*;

public class ProgramUI {

    /**
     * Creates a JFrame containing the control panel for the chronometer program
     * @param nbChrono number of chronometers to manage
     */
    public ProgramUI(int nbChrono) {
        JFrame frame = new JFrame("Panneau de contrôle");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.add(new ControlPanelUI(nbChrono));
        frame.pack(); // Resize frame
        frame.setLocationRelativeTo(null); //Centers frame
        frame.setVisible(true);
    }
}
