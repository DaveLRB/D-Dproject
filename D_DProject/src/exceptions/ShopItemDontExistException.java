package exceptions;

public class ShopItemDontExistException extends RuntimeException {
    public ShopItemDontExistException() {
        super("The shop don't have this item.");
    }

    public ShopItemDontExistException(String message) {
        super(message);
    }
}
