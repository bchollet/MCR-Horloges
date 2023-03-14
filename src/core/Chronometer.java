package core;

import utils.Observer;
import utils.Subject;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class Chronometer extends Subject {
    private final List<Observer> observers;
    private static int count;
    private final int id;
    private long seconds = 0;
    private Timer timer;
    private boolean isRunning;

    public Chronometer() {
        observers = new ArrayList<>();
        id = ++count;
        isRunning = false;
    }

    /**
     * Starts a task that increments number of elapsed seconds each seconds
     */
    public void start() {
        if (!isRunning) {
            timer = new Timer();
            isRunning = true;
            timer.scheduleAtFixedRate(new TimerTask() {
                @Override
                public void run() {
                    seconds++;
                    notifyObservers();
                }
            }, 1000, 1000);
        }
    }

    /**
     * Stop TimerTask if it is running
     */
    public void stop() {
        if (isRunning) {
            timer.cancel();
            isRunning = false;
        }
    }

    /**
     * Switch TimerTask between on and off
     */
    public void toggle() {
        if (isRunning) {
            stop();
        } else {
            start();
        }
    }

    /**
     * Stops TimerTask and reset counter
     */
    public void reset() {
        stop();
        seconds = 0;
        notifyObservers();
    }

    public int getId() {
        return id;
    }

    public long getSeconds() {return seconds;}

    @Override
    public void addObserver(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void deleteObserver(Observer o) {
        this.observers.remove(o);
    }

    @Override
    public void deleteObservers() {
        for (Observer o : observers) {
            deleteObserver(o);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(seconds);
        }
    }
}
