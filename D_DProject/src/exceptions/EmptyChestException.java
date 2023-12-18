package exceptions;

public class EmptyChestException extends RuntimeException {
    public EmptyChestException() {
        super("But is empty...");
    }
}
