package lambda;

record RecordLogger(String name) implements Logger {


    @Override
    public void logMessage(String message) {
        System.out.println(name + ": " + message);
    }
}
