package utils;

public abstract class Subject {
    /**
     * Adds an observer to the subject
     * @param o the observable to add to subscription list
     */
    public abstract void addObserver(Observer o);

    /**
     * Deletes an observer to the subject
     * @param o the observable to delete from subscription list
     */
    public abstract void deleteObserver(Observer o);

    /**
     * Deletes all observers
     */
    public abstract void deleteObservers();

    /**
     * Run all update methods on all observers subscribed to the subject
     */
    public abstract void notifyObservers();
}
