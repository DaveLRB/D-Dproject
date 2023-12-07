package exceptions;

public class ShopIsEmptyException extends RuntimeException {
    public ShopIsEmptyException(String message) {
        super(message);
    }

    public ShopIsEmptyException() {
        super("This shop is empty.");
    }
}
