package exceptions;

public class DontHaveGoldException extends  RuntimeException {
    public DontHaveGoldException() {
        super("You don't have gold to buy this item.");
    }

    public DontHaveGoldException(String message) {
        super(message);
    }
}
