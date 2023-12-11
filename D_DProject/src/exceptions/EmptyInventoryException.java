package exceptions;

public class EmptyInventoryException extends RuntimeException {
    public EmptyInventoryException() {
        super("Empty inventory.");
    }
}
