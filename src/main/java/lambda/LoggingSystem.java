package lambda;

public class LoggingSystem {

    public static void main(String[] args){
        RecordLogger recordLogger = new RecordLogger("RecLog");
        ClassLogger classLogger = new ClassLogger("ClassLog");

        Logger logLambda1 = message -> recordLogger.logMessage("Lambda log1: " + message);
        Logger logLambda2 = message -> classLogger.logMessage("Lambda log2: " + message);

        logLambda1.logMessage("This is message by lambda1: ");
        logLambda2.logMessage("This is message by Lambda2: ");

    }
}
