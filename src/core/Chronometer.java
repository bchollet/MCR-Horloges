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
    private boolean hasChanged;

    public Chronometer() {
        observers = new ArrayList<>();
        id = ++count;
        isRunning = false;
        hasChanged = false;
    }

    public void start() {
        if (!isRunning) {
            timer = new Timer();
            isRunning = true;
            timer.scheduleAtFixedRate(new TimerTask() {
                @Override
                public void run() {
                    seconds++;
                    tick();
                    //TODO: NotifyAll
                }
            }, 1000, 1000);
        }
    }

    public void stop() {
        if (isRunning) {
            timer.cancel();
            isRunning = false;
        }
    }

    public void toggle() {
        if (isRunning) {
            stop();
        } else {
            start();
        }
    }

    public void reset() {
        stop();
        seconds = 0;
        tick();
    }

    public int getId() {
        return id;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public long getSeconds() {return seconds;}

    private void tick() {
        setChanged();
        notifyObservers();
        clearChanged();
    }

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
    protected void setChanged() {
        hasChanged = true;
    }

    @Override
    protected void clearChanged() {
        hasChanged = false;
    }

    @Override
    public boolean hasChanged() {
        return hasChanged;
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(seconds);
        }
    }
}
