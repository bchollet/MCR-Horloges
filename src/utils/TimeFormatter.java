package utils;

public class TimeFormatter {
    public static String formatTime(long elapsedTimeInSeconds) {
        long heures = getHours(elapsedTimeInSeconds);
        long minutes = getMinutes(elapsedTimeInSeconds);
        long secondes = getSeconds(elapsedTimeInSeconds);
        return String.format("%02dh %02dm %02ds", heures, minutes, secondes);
    }

    public static long getHours(long elapsedTimeInSeconds) {
        return elapsedTimeInSeconds / 3600;
    }

    public static long getMinutes(long elapsedTimeInSeconds) {
        return (elapsedTimeInSeconds % 3600) / 60;
    }

    public static long getSeconds(long elapsedTimeInSeconds) {
        return elapsedTimeInSeconds % 60;
    }
}
