import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MyLogger {

    private static MyLogger instance; // declare static instacne to always be in memory

    private String time = getTime();

    private MyLogger() { // private constructor to prevent other classes from creating an object of the
                         // class

    }

    // static method to get the current instance of the class
    public static MyLogger getInstance() {
        if (instance == null) { // we check if there is no instance we cereate it, if there is an instance we
                                // skip the if condtion and return it
            instance = new MyLogger();
        }
        return instance; // we return the insctance
    }

    // void method to print the message and class name with specific format
    public void Info(String infoMessage, String className) {
        System.out.printf("[INFO] [%s] %s [%s]\n", className, infoMessage, time);
    }

    // void method to print the message and class name with specific format
    public void Warning(String warningMessage, String className) {
        System.out.printf("[WARNING] [%s] %s [%s]\n", className, warningMessage, time);
    }

    // This is a known utiltiy method to print the date
    private String getTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return LocalDateTime.now().format(formatter);
    }
}
