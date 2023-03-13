package ui.chronometer;

import core.Chronometer;
import utils.Observer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import static utils.ProgramConstant.DIAL_SIZE;

public abstract class ChronometerUI extends JPanel implements Observer {
    private final Chronometer chronometer;
    private final int id;
    private long seconds;

    protected ChronometerUI(Chronometer chronometer) {
        this.chronometer = chronometer;
        chronometer.addObserver(this);
        id = chronometer.getId();
        seconds = chronometer.getSeconds();
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                chronometer.toggle();
            }
        });
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(DIAL_SIZE, DIAL_SIZE);
    }
    @Override
    public void update(long seconds) {
        this.seconds = seconds;
        this.repaint();
    }

    public int getId() {
        return id;
    }

    public long getSeconds() {
        return seconds;
    }

    public void unsubscribeSubject() {
        chronometer.deleteObserver(this);
    }
}
