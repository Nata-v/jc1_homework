package part18.task70;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.logError("Mistake#1");
        logger.logError("Mistake#2");
        logger.logError("Mistake#3");
        logger.closeLogger();
    }
}
