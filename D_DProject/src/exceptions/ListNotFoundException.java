package exceptions;

public class ListNotFoundException extends RuntimeException {
    public ListNotFoundException(String message) {
        super(message);
    }

    public ListNotFoundException() {
        super("List not found.");
    }
}
