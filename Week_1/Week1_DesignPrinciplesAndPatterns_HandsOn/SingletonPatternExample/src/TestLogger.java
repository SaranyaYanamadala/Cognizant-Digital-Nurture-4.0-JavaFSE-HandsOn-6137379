class Logger {
    // a static private instance veriable
    private static Logger log = new Logger();

    // a private constructor
    private Logger() {
        System.out.println("Logger is initialized.");
    }

    // a public static getinstance method
    public static Logger getInstance() {
        return log;
    }
}

// a seperate class to test the Logger
public class TestLogger {
    public static void main(String[] args) {
        Logger log1 = Logger.getInstance();
        Logger log2 = Logger.getInstance();

        if(log1 == log2) {
            System.out.println("Both the instances are equal.");
        } else {
            System.out.println("Different instances.");
        }

    }
}
