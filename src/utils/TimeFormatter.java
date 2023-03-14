package utils;

public class TimeFormatter {

    /**
     * Transform a number of elapsed seconds into a string
     * @param elapsedTimeInSeconds a number of elapsed seconds
     * @return A formatted string of elapsed time
     */
    public static String formatTime(long elapsedTimeInSeconds) {
        long heures = getHours(elapsedTimeInSeconds);
        long minutes = getMinutes(elapsedTimeInSeconds);
        long secondes = getSeconds(elapsedTimeInSeconds);
        return String.format("%02dh %02dm %02ds", heures, minutes, secondes);
    }

    /**
     * Get the number of hours in an elapsed time in seconds
     * @param elapsedTimeInSeconds a number of elapsed seconds
     * @return The number of hours elapsed
     */
    public static long getHours(long elapsedTimeInSeconds) {
        return elapsedTimeInSeconds / 3600;
    }

    /**
     * Get the number of minutes in an elapsed time in seconds
     * @param elapsedTimeInSeconds a number of elapsed seconds
     * @return The number of minutes elapsed
     */
    public static long getMinutes(long elapsedTimeInSeconds) {
        return (elapsedTimeInSeconds % 3600) / 60;
    }

    /**
     * Get the number of seconds in an elapsed time in seconds
     * @param elapsedTimeInSeconds a number of elapsed seconds
     * @return The number of seconds elapsed modulo 60
     */
    public static long getSeconds(long elapsedTimeInSeconds) {
        return elapsedTimeInSeconds % 60;
    }
}
