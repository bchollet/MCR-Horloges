package utils;

public abstract class Subject {
    public abstract void addObserver(Observer o);
    public abstract void deleteObserver(Observer o);
    public abstract void deleteObservers();
    protected abstract void setChanged();
    protected abstract void clearChanged();
    public abstract boolean hasChanged();
    public abstract void notifyObservers();
}
