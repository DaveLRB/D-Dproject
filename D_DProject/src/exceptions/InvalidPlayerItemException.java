package exceptions;

public class InvalidPlayerItemException extends RuntimeException {
    public InvalidPlayerItemException() {
        super("Invalid item.");
    }

    public InvalidPlayerItemException(String message) {
        super(message);
    }
}
