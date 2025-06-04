import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogLevels {
    
    public static String message(String logLine) {
        String[] parts = logLine.split(":");
        return parts[1].trim();
    }
    public static String logLevel(String logLine) {
        // Pattern pattern = Pattern.compile("(?<=\\[).*?(?=\\]:)");
        // Matcher matcher = pattern.matcher(logLine);
        // matcher.find();
        // return matcher.group().toLowerCase();
        int startIndex = logLine.indexOf('[') + 1;
        int endIndex = logLine.indexOf(']');
        return logLine.substring(startIndex, endIndex).toLowerCase();
    }
    
    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
    
    // public static void main(String[] args) {
    //     System.out.println(LogLevels.logLevel("[ERROR]: Invalid operation"));
    // }
}
