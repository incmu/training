package lambda;

public class ClassLogger implements Logger {
    private final String name;

    public ClassLogger(String name){
        this.name = name;
    }

    @Override
    public void logMessage(String message) {
        System.out.println(name + ": " + message);
    }
}
