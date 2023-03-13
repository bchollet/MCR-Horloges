package utils;

public abstract class Subject {
    public abstract void addObserver(Observer o);
    public abstract void deleteObserver(Observer o);
    public abstract void deleteObservers();
    public abstract void notifyObservers();
}
