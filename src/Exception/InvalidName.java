package Exception;

public class InvalidName extends RuntimeException {
    private final String customMessage;

    public InvalidName(String message) {
        super(message);
        this.customMessage = message;
    }

    @Override
    public String getMessage() {
        return "DataError: " + customMessage;
    }
}