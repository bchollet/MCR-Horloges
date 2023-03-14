package utils;

public interface Observer {

    /**
     * Defines a routine to run when a observable change its state
     * @param seconds A number of elapsed seconds
     */
    void update(long seconds);
}
